# min_finder Component (`c/C10`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The minimum finder initializes its candidate value to 0, causing it to return 0 instead of the lowest value in positive arrays.

> **Note:** Function declarations are in [`min_finder.h`](min_finder.h).

### Expected Behavior
For [8, 3, 11], the minimum must be 3. Single-element arrays must also be handled correctly.

### Acceptance Criteria
- find_minimum / findMinimum returns 3 for [8, 3, 11].
- Preserves the existing function signatures declared in `min_finder.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C10
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C10
```
