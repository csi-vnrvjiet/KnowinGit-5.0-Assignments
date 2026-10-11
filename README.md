# KnowinGit 5.0

Open-source contribution lab repository for KnowinGit 5.0, designed for second-year undergraduate engineering students.

The goal of this activity is to introduce students to the real-world workflow of open-source development: reading unfamiliar code, identifying reported bugs, making localized fixes, and opening standard GitHub Pull Requests with automated continuous integration (CI) testing.

---

## Prerequisites

To participate in KnowinGit 5.0, you only need:

- **Git** - for cloning the repository, creating branches, and pushing your changes (or use the GitHub web interface).
- **A GitHub Account** - to fork the repository and submit your Pull Request.

> **Note: No compilers needed!** You do **not** need to install GCC, MinGW, or JDK on your computer. When you submit a Pull Request, GitHub Actions automatically compiles and runs the regression tests on GitHub's cloud servers.

### Installing Git

<details>
<summary><strong>Windows</strong></summary>

1. Go to [https://git-scm.com/downloads](https://git-scm.com/downloads)
2. Download the Windows installer and run it.
3. Click "Next" through all the screens - the default settings are fine.
4. After installation, open **Command Prompt** and verify:
   ```
   git --version
   ```
   You should see something like `git version 2.x.x`.

</details>

<details>
<summary><strong>Mac</strong></summary>

1. Open **Terminal** (search for "Terminal" in Spotlight).
2. Run:
   ```bash
   xcode-select --install
   ```
3. A popup will appear - click "Install" and wait for it to finish.
4. Verify:
   ```bash
   git --version
   ```

</details>

<details>
<summary><strong>Linux (Ubuntu / Debian)</strong></summary>

1. Open a terminal and run:
   ```bash
   sudo apt update
   sudo apt install git
   ```
2. Verify:
   ```bash
   git --version
   ```

</details>

<details>
<summary><strong>Optional: Installing Compilers for Local Testing</strong></summary>

This is completely optional. All testing is performed automatically by GitHub Actions when you open a Pull Request. If you would like local compilers on your machine:

**For C (Windows):**
- Install MSYS2 from [https://www.msys2.org/](https://www.msys2.org/) and run: `pacman -S mingw-w64-ucrt-x86_64-gcc`
- Or add existing CodeBlocks GCC to your PATH: `C:\Program Files\CodeBlocks\MinGW\bin`

**For Java (Windows / Mac / Linux):**
- Download Adoptium Temurin JDK 17+ from [https://adoptium.net/](https://adoptium.net/)

</details>

---

## Repository Contents

```text
KnowinGit-5.0/
|-- README.md                           # Main repository documentation
|-- CONTRIBUTING.md                     # Contributor workflow guide
|-- LICENSE                             # MIT License
|-- .gitignore                          # Build artifact ignores
|
|-- components/                         # Component source code
|   |-- c/                              # 40 C components (C01 through C40)
|   |   |-- C01/                        # student_search.h, student_search.c, README.md
|   |   `-- ...
|   |
|   `-- java/                           # 40 Java components (J01 through J40)
|       |-- J01/                        # StudentSearch.java, README.md
|       `-- ...
|
|-- tests/                              # Regression test suites (used by GitHub Actions CI)
|   |-- c/                              # 40 C test suites (C01 through C40)
|   |   |-- C01/                        # test_student_search.c
|   |   `-- ...
|   |
|   `-- java/                           # 40 Java test suites (J01 through J40)
|       |-- J01/                        # StudentSearchTest.java
|       `-- ...
|
|-- scripts/
|   |-- test-component.bat              # Optional local test runner for Windows (CMD / PowerShell)
|   `-- test-component.sh               # Optional local test runner for Mac / Linux / Git Bash
|
`-- .github/
    |-- pull_request_template.md        # Standardized PR template
    `-- workflows/
        `-- component-tests.yml         # CI workflow testing only changed components
```

---

## Subsystems

1. **`core-records` (C01-C10, J01-J10):** Student identification lookup, marks averaging, grade thresholds, duplicate validation, record deletion, score sorting, parity counts, and array aggregation.
2. **`core-algorithms` (C11-C20, J11-J20):** Frequency counting, first match lookup, reversal routines, list insertion, value removal, binary search, cyclic rotation, range filters, and extreme value indices.
3. **`core-strings` (C21-C36, J21-J36):** Palindrome checks, vowel/digit counters, exact matching, case-insensitive comparison, word tokenizers, character search/replace, space compressors, and letter filters.
4. **`core-buffers` (C37-C40, J37-J40):** Bounded stack implementations, LIFO pointer management, FIFO queue order, and capacity boundary guards.

---

## Quick Start

### Step 1: Browse and Claim an Issue

1. Review open bug reports in the [GitHub Issues](../../issues) tab. Look for issues labeled `good first issue` and `status:available`.
2. Pick **one issue** - either a C component (such as `C01`) or a Java component (such as `J01`).
3. Leave a comment on the issue asking to be assigned.

### Step 2: Fork and Clone

Fork this repository to your personal GitHub account and clone it locally:

```bash
git clone https://github.com/<your-username>/KnowinGit-5.0-Assignments.git
cd KnowinGit-5.0-Assignments
```

Create a new branch for your work:

```bash
git checkout -b fix/issue-C01-student-search
```

### Step 3: Implement Your Fix

1. Open the component source file in `components/c/CXX/` or `components/java/JXX/` in your favorite code editor (VS Code, Notepad, etc.).
2. Read the problem description in your assigned issue.
3. Apply a localized fix to resolve the root cause.
4. **Important rules:**
   - Modify **only** the source file for your component (for example, `components/c/C01/student_search.c`).
   - Do **not** modify headers, test files, or public method signatures.

### Step 4: Open a Pull Request

Commit your modified implementation file and push to your fork:

```bash
git add components/c/C01/student_search.c
git commit -m "fix(student_search): correctly check final cohort index"
git push origin fix/issue-C01-student-search
```

Go to your fork on GitHub and click **Compare & pull request**. Fill out the pull request template and submit.

### Step 5: Verify Automated PR Tests (Required)

**The automated regression tests on your Pull Request must pass cleanly before your PR can be approved:**

- Whenever you submit or update a Pull Request, GitHub Actions automatically compiles and runs the regression tests on GitHub's cloud servers.
- Look at the checks status at the bottom of your Pull Request page:
  - **Green checkmark (PASS):** All regression tests passed cleanly! Your PR is ready for maintainer review.
  - **Red cross (FAIL):** One or more tests failed. Click **Details** next to the failed check to see the exact test failure output. Edit your code locally, commit, and push again to the same branch. GitHub Actions will automatically re-test your Pull Request.

---

### Optional: Local Testing (If You Have Compilers Installed)

You do **not** need a local compiler to participate. However, if you already have GCC (for C) or JDK (for Java) installed and want to run tests locally before pushing, run from the repository root:

**Windows (Command Prompt or PowerShell):**
```cmd
REM Test a C component (example: C01)
scripts\test-component.bat C01

REM Test a Java component (example: J01)
scripts\test-component.bat J01
```

**Mac / Linux / Git Bash:**
```bash
# Test a C component (example: C01)
./scripts/test-component.sh c/C01

# Test a Java component (example: J01)
./scripts/test-component.sh java/J01
```

---

## Troubleshooting

<details>
<summary><strong>My Pull Request automated test failed (Red Cross) - What should I do?</strong></summary>

1. On your Pull Request page on GitHub, scroll down to the checks section and click **Details** next to "Test Changed Components".
2. View the test output log. It will show which test case failed (for example, `[FAIL] test_boundary_condition: boundary condition verification failed`).
3. Re-read the bug description and acceptance criteria in your assigned GitHub issue.
4. Update your code in your local editor.
5. Commit and push the fix to the same branch:
   ```bash
   git add <your-file>
   git commit -m "fix: address boundary condition test failure"
   git push origin fix/issue-C01-student-search
   ```
6. The GitHub Actions check on your Pull Request will automatically re-run. Once the check turns into a green checkmark, your fix is verified!

</details>

<details>
<summary><strong>Do I need to install GCC or Java on my computer?</strong></summary>

**No.** You do not need to install any compilers locally. All compilation and regression testing is handled automatically by GitHub Actions in the cloud whenever you submit a Pull Request.

</details>

<details>
<summary><strong>"Permission denied" when running scripts (Mac/Linux)</strong></summary>

If you are running the optional test script on Mac or Linux and see "Permission denied", run this once:
```bash
chmod +x scripts/test-component.sh
```

</details>

---

## Contributing

See [`CONTRIBUTING.md`](CONTRIBUTING.md) for the complete contributor guide and sprint instructions.

---

## License

This project is licensed under the [MIT License](LICENSE).
