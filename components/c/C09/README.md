# max_finder Component (`c/C09`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The maximum finder initializes its candidate value to 0, causing it to return 0 when all array elements are negative.

> **Note:** Function declarations are in [`max_finder.h`](max_finder.h).

### Expected Behavior
For [-8, -3, -11], the maximum must be -3. Single-element and mixed arrays must also return the correct maximum.

### Acceptance Criteria
- find_maximum / findMaximum returns -3 for [-8, -3, -11].
- Preserves the existing function signatures declared in `max_finder.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C09
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C09
```
