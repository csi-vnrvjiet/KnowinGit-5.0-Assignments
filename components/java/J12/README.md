# FirstIndex Component (`java/J12`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The linear search routine does not break upon finding a match, returning the last occurrence index instead of the first.

> **Note:** Method declarations and signatures are in [`FirstIndex.java`](FirstIndex.java).

### Expected Behavior
For [4, 7, 4], searching for 4 must return index 0. If absent, return -1.

### Acceptance Criteria
- find_first_index / findFirstIndex returns 0 for target 4 in [4, 7, 4].
- Preserves the existing class structure and method signatures in `FirstIndex.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J12
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J12
```
