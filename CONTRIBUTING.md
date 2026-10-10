# Contributing to KnowinGit 5.0

Welcome! Whether you are participating in a contribution sprint or fixing a reported defect, this guide will walk you through our open-source contribution workflow.

---

## 1. Finding an Issue
1. Browse the [GitHub Issues](../../issues) tab.
2. Filter for issues labeled `good first issue` and `status:available`.
3. Explore the `components/` directory or review the Subsystems list in [`README.md`](README.md) for an overview of all library modules.

## 2. Claiming an Issue
Leave a comment on the issue you wish to resolve:
> *"I would like to work on this issue. Please assign it to me."*

A maintainer will assign the issue to you and update the label to `status:in-progress`.

## 3. Fork and Clone
Fork the repository to your personal GitHub account, then clone it locally:
```bash
git clone https://github.com/<your-username>/KnowinGit-5.0-Assignments.git
cd KnowinGit-5.0-Assignments
```

## 4. Create a Feature Branch
Create a descriptive branch for your fix:
```bash
git checkout -b fix/issue-C01-student-search
```

## 5. Reproduce the Bug
Before changing any code, run the regression test suite to observe the reported failure:
```bash
# For C components:
./scripts/test-component.sh c/C01

# For Java components:
./scripts/test-component.sh java/J01
```
Observe the test failure and error diagnostic matching the issue report.

## 6. Implement the Fix
- Inspect the component source file in `components/c/C01/` or `components/java/J01/`.
- Apply a clean, localized fix to resolve the root cause.
- **Rule:** Do NOT modify public API signatures or delete test cases.

## 7. Verify Regression Tests
Re-run the test suite to confirm that all tests now pass cleanly:
```bash
./scripts/test-component.sh c/C01
```
The test runner should report `>> Status: PASS`.

## 8. Commit and Push
Commit only your modified implementation file:
```bash
git add components/c/C01/student_search.c
git commit -m "fix(student_search): correctly check final cohort index"
git push origin fix/issue-C01-student-search
```

## 9. Open a Pull Request
1. Open a Pull Request from your branch against the `main` branch.
2. Fill out all sections of the [Pull Request Template](.github/pull_request_template.md).
3. Reference the issue number (e.g., `Closes #1`).

## 10. Address Review Comments
If maintainers suggest revisions:
1. Make changes locally on the same branch.
2. Commit and push:
   ```bash
   git push origin fix/issue-C01-student-search
   ```
3. The open PR will automatically update.
