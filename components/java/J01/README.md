# StudentSearch Component (`java/J01`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
Linear search fails to find the student ID when the target record is located at the final index of the array.

> **Note:** Method declarations and signatures are in [`StudentSearch.java`](StudentSearch.java).

### Expected Behavior
Searching the first, middle, and final array elements must return the correct index; a missing value must return -1.

### Acceptance Criteria
- Searching for 104 in [101, 102, 103, 104] returns index 3. Searching for 101 returns 0, 102 returns 1, and 999 returns -1.
- Preserves the existing class structure and method signatures in `StudentSearch.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J01
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J01
```
