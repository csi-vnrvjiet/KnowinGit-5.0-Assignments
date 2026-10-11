# grade_calculator Component (`c/C02`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The average calculator performs integer division instead of floating-point division, truncating fractional values.

> **Note:** Function declarations are in [`grade_calculator.h`](grade_calculator.h).

### Expected Behavior
Averaging 80 and 81 must produce 80.5, not 80. Integer-valued averages like [70, 80, 90] must continue to produce 80.0.

### Acceptance Criteria
- calculate_average / calculateAverage returns 80.5 for [80, 81], 80.0 for [70, 80, 90], and 0.0 for empty arrays.
- Preserves the existing function signatures declared in `grade_calculator.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C02
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C02
```
