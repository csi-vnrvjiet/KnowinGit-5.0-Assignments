# grade_calculator Component (`c/C02`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The average calculator performs integer division instead of floating-point division, truncating fractional values.

## Module Interface
Declared in [`grade_calculator.h`](grade_calculator.h):
```c
// See grade_calculator.h for full declarations and type definitions
```

### Expected Behavior
Averaging 80 and 81 must produce 80.5, not 80. Integer-valued averages like [70, 80, 90] must continue to produce 80.0.

### Acceptance Criteria
- calculate_average / calculateAverage returns 80.5 for [80, 81], 80.0 for [70, 80, 90], and 0.0 for empty arrays.
- Preserves the existing function signatures declared in `grade_calculator.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C02
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C02 components/c/C02/*.c tests/c/C02/*.c -o test_runner
./test_runner
```
