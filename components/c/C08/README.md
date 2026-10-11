# array_sum Component (`c/C08`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The array summation routine starts iterating at index 1 instead of index 0, omitting the initial element from the calculated sum.

> **Note:** Function declarations are in [`array_sum.h`](array_sum.h).

### Expected Behavior
The sum must include all elements from index 0 to the final element.

### Acceptance Criteria
- Summing [-3, 2, 5] yields 4.
- Preserves the existing function signatures declared in `array_sum.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C08
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C08
```
