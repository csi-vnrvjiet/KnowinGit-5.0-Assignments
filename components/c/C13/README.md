# array_reversal Component (`c/C13`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The in-place array reversal iterates across the entire length of the array, swapping elements twice and reverting them to original order.

> **Note:** Function declarations are in [`array_reversal.h`](array_reversal.h).

### Expected Behavior
Reverse the complete array while preserving every value. Test odd- and even-length arrays.

### Acceptance Criteria
- Reversing [1, 2, 3, 4] results in [4, 3, 2, 1].
- Preserves the existing function signatures declared in `array_reversal.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C13
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C13
```
