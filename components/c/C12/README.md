# first_index Component (`c/C12`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The linear search routine does not break upon finding a match, returning the last occurrence index instead of the first.

> **Note:** Function declarations are in [`first_index.h`](first_index.h).

### Expected Behavior
For [4, 7, 4], searching for 4 must return index 0. If absent, return -1.

### Acceptance Criteria
- find_first_index / findFirstIndex returns 0 for target 4 in [4, 7, 4].
- Preserves the existing function signatures declared in `first_index.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C12
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C12
```
