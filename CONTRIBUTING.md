# Contributing to KnowinGit 5.0

Welcome! Whether you are participating in a contribution sprint or fixing a reported defect, this guide will walk you through our open-source contribution workflow.

> **New to Git and GitHub?** Don't worry - this guide assumes zero prior experience. You do not need any local compilers (GCC or Java) installed. Just follow each step carefully.

---

## 1. Finding an Issue

1. Go to the [GitHub Issues](../../issues) tab at the top of this repository page.
2. Look for issues labeled `good first issue` and `status:available`.
3. Pick **one issue** - either a C component (such as `C01`) or a Java component (such as `J01`).

## 2. Claiming an Issue

Leave a comment on the issue you wish to resolve:
> *"I would like to work on this issue. Please assign it to me."*

A maintainer will assign the issue to you and update the label to `status:in-progress`.

## 3. Fork and Clone

**Fork** the repository to your personal GitHub account (click the "Fork" button on the top-right of the repo page), then **clone** it locally:

```bash
git clone https://github.com/<your-username>/KnowinGit-5.0-Assignments.git
cd KnowinGit-5.0-Assignments
```

> **Tip:** Replace `<your-username>` with your actual GitHub username.

## 4. Create a Feature Branch

Create a descriptive branch for your fix:

```bash
git checkout -b fix/issue-C01-student-search
```

## 5. Inspect the Bug

1. Open your assigned issue on GitHub and read the **Problem Description**, **Steps to Reproduce**, and **Expected Behavior**.
2. Locate the source file in your editor:
   - For C components: `components/c/CXX/` (for example, `components/c/C01/student_search.c`)
   - For Java components: `components/java/JXX/` (for example, `components/java/J01/StudentSearch.java`)
3. Trace the logic to understand why the defect occurs.

## 6. Implement the Fix

- Open the component implementation file in your editor.
- Apply a clean, localized fix to resolve the root cause.
- **Contribution Rules:**
  - Modify **only** your component's implementation file.
  - Do **not** modify headers, test files, or public method signatures.
  - Keep your changes clean, concise, and focused on the bug fix.

## 7. Commit and Push

Commit **only** your modified implementation file:

```bash
git add components/c/C01/student_search.c
git commit -m "fix(student_search): correctly check final cohort index"
git push origin fix/issue-C01-student-search
```

> **Tip:** Replace the file path, commit message, and branch name to match your actual issue.

## 8. Open a Pull Request

1. Go to your fork on GitHub. You should see a banner saying "Compare & pull request" - click it.
2. Fill out all sections of the [Pull Request Template](.github/pull_request_template.md).
3. Reference the issue number (for example, `Closes #1`).
4. Click **Create pull request**.

## 9. Verify Automated PR Tests (Required)

**The automated regression tests on your Pull Request must pass before your contribution can be merged:**

1. As soon as you open your Pull Request, GitHub Actions automatically compiles and runs the regression tests on GitHub's cloud servers.
2. Scroll to the bottom of your Pull Request page to check the status:
   - **Green checkmark (PASS):** All regression tests passed! Your PR is ready for maintainer review.
   - **Red cross (FAIL):** One or more tests failed.
3. **If tests fail:**
   - Click **Details** next to "Test Changed Components" to see the exact test failure output.
   - Read the failure message to see which assertion failed.
   - Fix the code locally on your branch.
   - Commit and push to the same branch:
     ```bash
     git add <your-file>
     git commit -m "fix: address test failure"
     git push origin fix/issue-C01-student-search
     ```
   - GitHub Actions will re-test your Pull Request automatically. Once the check turns green, your PR is ready!

## 10. Address Review Comments

If maintainers suggest revisions:
1. Make changes locally on the same branch.
2. Commit and push:
   ```bash
   git push origin fix/issue-C01-student-search
   ```
3. The open PR and its automated tests will automatically update.

---

## Optional: Local Testing (If You Have Compilers Installed)

Local testing is **not required** because GitHub Actions tests your PR automatically. However, if you already have GCC (for C) or JDK (for Java) installed and want to run tests locally before pushing:

**Windows (Command Prompt or PowerShell):**
```cmd
REM For C components:
scripts\test-component.bat C01

REM For Java components:
scripts\test-component.bat J01
```

**Mac / Linux / Git Bash:**
```bash
# For C components:
./scripts/test-component.sh c/C01

# For Java components:
./scripts/test-component.sh java/J01
```
