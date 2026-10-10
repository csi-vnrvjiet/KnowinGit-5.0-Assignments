#!/usr/bin/env bash
# ==============================================================================
# test-component.sh: Regression Test Runner
# ==============================================================================
# Compiles and runs test suites from tests/ against code in components/
# Usage:
#   ./scripts/test-component.sh c/C01
#   ./scripts/test-component.sh java/J01
# ==============================================================================

set -e

TARGET="$1"

if [ -z "$TARGET" ]; then
    echo "Usage: $0 <c/CXX | java/JXX | CXX | JXX>"
    exit 1
fi

TARGET="${TARGET#components/}"
TARGET="${TARGET#assignments/}"
TARGET="${TARGET#tests/}"

if [[ "$TARGET" =~ ^[cC][0-9]{2}$ ]]; then
    ID=$(echo "$TARGET" | tr '[:lower:]' '[:upper:]')
    LANG="c"
elif [[ "$TARGET" =~ ^[jJ][0-9]{2}$ ]]; then
    ID=$(echo "$TARGET" | tr '[:lower:]' '[:upper:]')
    LANG="java"
elif [[ "$TARGET" =~ ^c/[cC][0-9]{2}$ ]]; then
    ID=$(echo "${TARGET#c/}" | tr '[:lower:]' '[:upper:]')
    LANG="c"
elif [[ "$TARGET" =~ ^java/[jJ][0-9]{2}$ ]]; then
    ID=$(echo "${TARGET#java/}" | tr '[:lower:]' '[:upper:]')
    LANG="java"
else
    echo "Error: Unrecognized component target '$TARGET'"
    exit 1
fi

SRC_DIR="components/$LANG/$ID"
TEST_DIR="tests/$LANG/$ID"

if [ ! -d "$SRC_DIR" ]; then
    echo "Error: Source directory '$SRC_DIR' not found."
    exit 1
fi

if [ ! -d "$TEST_DIR" ]; then
    echo "Error: Test directory '$TEST_DIR' not found."
    exit 1
fi

echo "=========================================================="
echo "Running Regression Suite: $LANG/$ID"
echo "Source: $SRC_DIR"
echo "Tests:  $TEST_DIR"
echo "=========================================================="

find_c_compiler() {
    if command -v gcc >/dev/null 2>&1; then
        echo "gcc"
    elif [ -f "C:/Program Files/CodeBlocks/MinGW/bin/gcc.exe" ]; then
        echo "C:/Program Files/CodeBlocks/MinGW/bin/gcc.exe"
    elif [ -f "/c/Program Files/CodeBlocks/MinGW/bin/gcc.exe" ]; then
        echo "/c/Program Files/CodeBlocks/MinGW/bin/gcc.exe"
    elif command -v clang >/dev/null 2>&1; then
        echo "clang"
    else
        echo ""
    fi
}

if [ "$LANG" = "c" ]; then
    CC=$(find_c_compiler)
    if [ -z "$CC" ]; then
        echo "Error: C compiler (gcc or clang) not found."
        exit 1
    fi

    C_SRCS=$(find "$SRC_DIR" -maxdepth 1 -name "*.c")
    C_TESTS=$(find "$TEST_DIR" -maxdepth 1 -name "*.c")

    BIN_OUT="$TEST_DIR/test_runner"
    [ -f "$BIN_OUT" ] && rm -f "$BIN_OUT"
    [ -f "$BIN_OUT.exe" ] && rm -f "$BIN_OUT.exe"

    "$CC" -std=c11 -Wall -Wextra -pedantic -I"$SRC_DIR" $C_SRCS $C_TESTS -o "$BIN_OUT"

    RUNNER="$BIN_OUT"
    [ -f "$BIN_OUT.exe" ] && RUNNER="$BIN_OUT.exe"

    set +e
    "$RUNNER"
    STATUS=$?
    set -e

    rm -f "$BIN_OUT" "$BIN_OUT.exe"

    if [ $STATUS -eq 0 ]; then
        echo ">> Status: PASS"
    else
        echo ">> Status: FAIL (exit code $STATUS)"
    fi
    exit $STATUS

elif [ "$LANG" = "java" ]; then
    if ! command -v javac >/dev/null 2>&1 || ! command -v java >/dev/null 2>&1; then
        echo "Error: java or javac command not found."
        exit 1
    fi

    JAVA_SRCS=$(find "$SRC_DIR" -maxdepth 1 -name "*.java")
    JAVA_TESTS=$(find "$TEST_DIR" -maxdepth 1 -name "*.java")

    javac -d "$TEST_DIR" $JAVA_SRCS $JAVA_TESTS

    TEST_CLASS_FILE=$(find "$TEST_DIR" -maxdepth 1 -name "*Test.java" | head -n 1)
    TEST_CLASS=$(basename "$TEST_CLASS_FILE" .java)

    set +e
    java -cp "$TEST_DIR" "$TEST_CLASS"
    STATUS=$?
    set -e

    rm -f "$TEST_DIR"/*.class

    if [ $STATUS -eq 0 ]; then
        echo ">> Status: PASS"
    else
        echo ">> Status: FAIL (exit code $STATUS)"
    fi
    exit $STATUS
fi
