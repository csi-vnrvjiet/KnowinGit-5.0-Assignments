# EvenCounter Component (`java/J07`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The even number counter stops iterating before checking the element at the final index.

> **Note:** Method declarations and signatures are in [`EvenCounter.java`](EvenCounter.java).

### Expected Behavior
Count every even value in the array, including one at the final position. Zero and negative values must be handled correctly.

### Acceptance Criteria
- Counting [1, 3, 5, 8] returns 1. Counting [-4, 0, 3] returns 2.
- Preserves the existing class structure and method signatures in `EvenCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J07
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J07
```
