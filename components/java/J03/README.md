# PassingMarks Component (`java/J03`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The passing marks counter requires strictly greater than 40 marks instead of greater than or equal to 40, falsely failing students with exactly 40 marks.

> **Note:** Method declarations and signatures are in [`PassingMarks.java`](PassingMarks.java).

### Expected Behavior
Marks of 40 or more pass; marks below 40 fail. The function must return 2 for [39, 40, 41].

### Acceptance Criteria
- Marks equal to 40 are counted as passing. Returns 2 for [39, 40, 41] with threshold 40.
- Preserves the existing class structure and method signatures in `PassingMarks.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J03
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J03
```
