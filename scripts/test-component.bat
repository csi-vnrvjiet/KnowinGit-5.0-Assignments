@echo off
REM ==============================================================================
REM test-component.bat: Regression Test Runner (Windows)
REM ==============================================================================
REM Compiles and runs test suites from tests/ against code in components/
REM
REM Usage (from the repository root folder):
REM   scripts\test-component.bat C01
REM   scripts\test-component.bat J01
REM   scripts\test-component.bat c\C01
REM   scripts\test-component.bat java\J01
REM ==============================================================================

setlocal enabledelayedexpansion

REM Switch to repository root (parent folder of scripts\)
pushd "%~dp0.."

set "TARGET=%~1"

if "%TARGET%"=="" (
    echo.
    echo ERROR: No component specified.
    echo.
    echo Usage:  scripts\test-component.bat ^<component^>
    echo.
    echo Examples:
    echo   scripts\test-component.bat C01
    echo   scripts\test-component.bat J01
    echo   scripts\test-component.bat c\C01
    echo   scripts\test-component.bat java\J01
    echo.
    popd
    exit /b 1
)

REM Normalize forward slashes to backslashes
set "TARGET=%TARGET:/=\%"

REM Strip trailing backslash if present
if "%TARGET:~-1%"=="\" set "TARGET=%TARGET:~0,-1%"

REM Strip folder prefixes if user provided full path
set "TARGET=%TARGET:components\=%"
set "TARGET=%TARGET:assignments\=%"
set "TARGET=%TARGET:tests\=%"

REM Extract parts if separated by backslash (e.g. c\C01 or java\J01)
set "PART1="
set "PART2="
for /f "tokens=1,2 delims=\" %%A in ("%TARGET%") do (
    set "PART1=%%A"
    set "PART2=%%B"
)

set "LANG="
set "ID="

if not "%PART2%"=="" (
    if /i "%PART1%"=="c" (
        set "LANG=c"
        set "ID=%PART2%"
    )
    if /i "%PART1%"=="java" (
        set "LANG=java"
        set "ID=%PART2%"
    )
) else (
    set "FIRSTCHAR=%PART1:~0,1%"
    if /i "!FIRSTCHAR!"=="c" (
        set "LANG=c"
        set "ID=%PART1%"
    )
    if /i "!FIRSTCHAR!"=="j" (
        set "LANG=java"
        set "ID=%PART1%"
    )
)

if "%LANG%"=="" (
    echo.
    echo ERROR: Unrecognized component target '%TARGET%'
    echo        Expected format: C01, J01, c\C01, or java\J01
    echo.
    popd
    exit /b 1
)

REM Uppercase the ID (e.g. c01 -> C01, j01 -> J01)
set "FIRSTCHAR=!ID:~0,1!"
for %%A in (C J) do if /i "!FIRSTCHAR!"=="%%A" set "FIRSTCHAR=%%A"
set "REST=!ID:~1!"
set "ID=!FIRSTCHAR!!REST!"

set "SRC_DIR=components\%LANG%\%ID%"
set "TEST_DIR=tests\%LANG%\%ID%"

REM Verify source and test directories exist
if not exist "%SRC_DIR%" (
    echo.
    echo ERROR: Source directory '%SRC_DIR%' not found.
    echo        Make sure you are running this from the repository root folder.
    echo.
    popd
    exit /b 1
)

if not exist "%TEST_DIR%" (
    echo.
    echo ERROR: Test directory '%TEST_DIR%' not found.
    echo        Make sure you are running this from the repository root folder.
    echo.
    popd
    exit /b 1
)

echo ==========================================================
echo  Running Regression Suite: %LANG%/%ID%
echo  Source: %SRC_DIR%
echo  Tests:  %TEST_DIR%
echo ==========================================================

if /i "%LANG%"=="c" goto :run_c
if /i "%LANG%"=="java" goto :run_java

echo ERROR: Unsupported language '%LANG%'
popd
exit /b 1

REM ==============================================================================
REM  C Language Tests
REM ==============================================================================
:run_c
REM Find a C compiler
where gcc >nul 2>&1
if not errorlevel 1 (
    set "CC=gcc"
    goto :found_cc
)
if exist "C:\Program Files\CodeBlocks\MinGW\bin\gcc.exe" (
    set "CC=C:\Program Files\CodeBlocks\MinGW\bin\gcc.exe"
    goto :found_cc
)
if exist "C:\Program Files (x86)\CodeBlocks\MinGW\bin\gcc.exe" (
    set "CC=C:\Program Files (x86)\CodeBlocks\MinGW\bin\gcc.exe"
    goto :found_cc
)
if exist "C:\msys64\ucrt64\bin\gcc.exe" (
    set "CC=C:\msys64\ucrt64\bin\gcc.exe"
    goto :found_cc
)
if exist "C:\msys64\mingw64\bin\gcc.exe" (
    set "CC=C:\msys64\mingw64\bin\gcc.exe"
    goto :found_cc
)
if exist "C:\mingw64\bin\gcc.exe" (
    set "CC=C:\mingw64\bin\gcc.exe"
    goto :found_cc
)
if exist "C:\MinGW\bin\gcc.exe" (
    set "CC=C:\MinGW\bin\gcc.exe"
    goto :found_cc
)
if exist "C:\TDM-GCC-64\bin\gcc.exe" (
    set "CC=C:\TDM-GCC-64\bin\gcc.exe"
    goto :found_cc
)
if exist "C:\Program Files (x86)\Dev-Cpp\MinGW64\bin\gcc.exe" (
    set "CC=C:\Program Files (x86)\Dev-Cpp\MinGW64\bin\gcc.exe"
    goto :found_cc
)
where clang >nul 2>&1
if not errorlevel 1 (
    set "CC=clang"
    goto :found_cc
)

echo.
echo ERROR: C compiler not found (gcc or clang).
echo.
echo To install GCC on Windows:
echo   1. Option A (Recommended): Download MSYS2 from https://www.msys2.org/
echo      In MSYS2, run: pacman -S mingw-w64-ucrt-x86_64-gcc
echo      Then add C:\msys64\ucrt64\bin to your system PATH.
echo   2. Option B: Download WinLibs from https://winlibs.com/
echo      Extract to C:\mingw64 and add C:\mingw64\bin to PATH.
echo   3. Option C: If CodeBlocks is installed, add
echo      C:\Program Files\CodeBlocks\MinGW\bin to your system PATH.
echo.
echo See the Prerequisites section in README.md for full instructions.
echo.
popd
exit /b 1

:found_cc
echo Using compiler: !CC!
echo.

REM Clean old binaries
if exist "%TEST_DIR%\test_runner.exe" del "%TEST_DIR%\test_runner.exe"
if exist "%TEST_DIR%\test_runner" del "%TEST_DIR%\test_runner"

REM Compile
"!CC!" -std=c11 -Wall -Wextra -pedantic -I"%SRC_DIR%" "%SRC_DIR%\*.c" "%TEST_DIR%\*.c" -o "%TEST_DIR%\test_runner.exe"
if errorlevel 1 (
    echo.
    echo ERROR: Compilation failed. Check the errors above.
    echo.
    popd
    exit /b 1
)

REM Run tests
"%TEST_DIR%\test_runner.exe"
set "STATUS=!errorlevel!"

REM Clean up
if exist "%TEST_DIR%\test_runner.exe" del "%TEST_DIR%\test_runner.exe"

echo.
if !STATUS!==0 (
    echo ^>^> Status: PASS
) else (
    echo ^>^> Status: FAIL (exit code !STATUS!^)
)
popd
exit /b !STATUS!

REM ==============================================================================
REM  Java Language Tests
REM ==============================================================================
:run_java
REM Check for javac compiler
where javac >nul 2>&1
if not errorlevel 1 (
    set "JAVAC=javac"
    goto :found_javac
)
for /d %%D in ("C:\Program Files\Eclipse Adoptium\jdk-*" "C:\Program Files\Java\jdk-*" "C:\Program Files\Amazon Corretto\jdk-*" "C:\Program Files\Microsoft\jdk-*") do (
    if exist "%%D\bin\javac.exe" (
        set "JAVAC=%%D\bin\javac.exe"
        goto :found_javac
    )
)

echo.
echo ERROR: 'javac' command not found.
echo.
echo To install Java on Windows:
echo   1. Download JDK 17+ from https://adoptium.net/
echo   2. Run installer and ensure 'Add to PATH' and 'Set JAVA_HOME' are selected.
echo   3. Reopen Command Prompt.
echo.
echo See the Prerequisites section in README.md for full instructions.
echo.
popd
exit /b 1

:found_javac
REM Check for java runtime
where java >nul 2>&1
if not errorlevel 1 (
    set "JAVA=java"
    goto :found_java
)
for /d %%D in ("C:\Program Files\Eclipse Adoptium\jdk-*" "C:\Program Files\Java\jdk-*" "C:\Program Files\Amazon Corretto\jdk-*" "C:\Program Files\Microsoft\jdk-*") do (
    if exist "%%D\bin\java.exe" (
        set "JAVA=%%D\bin\java.exe"
        goto :found_java
    )
)

echo.
echo ERROR: 'java' runtime not found.
echo        Make sure the JDK bin folder is in your system PATH.
echo.
popd
exit /b 1

:found_java
echo Using compiler: !JAVAC!
echo Using runtime:  !JAVA!
echo.

REM Compile
"!JAVAC!" -d "%TEST_DIR%" "%SRC_DIR%\*.java" "%TEST_DIR%\*.java"
if errorlevel 1 (
    echo.
    echo ERROR: Compilation failed. Check the errors above.
    echo.
    popd
    exit /b 1
)

REM Find the test class name
set "TEST_CLASS="
for %%F in ("%TEST_DIR%\*Test.java") do (
    set "TEST_CLASS=%%~nF"
)

if "!TEST_CLASS!"=="" (
    echo ERROR: No test class file (*Test.java^) found in %TEST_DIR%.
    popd
    exit /b 1
)

REM Run tests
"!JAVA!" -cp "%TEST_DIR%" "!TEST_CLASS!"
set "STATUS=!errorlevel!"

REM Clean up .class files
del "%TEST_DIR%\*.class" 2>nul

echo.
if !STATUS!==0 (
    echo ^>^> Status: PASS
) else (
    echo ^>^> Status: FAIL (exit code !STATUS!^)
)
popd
exit /b !STATUS!
