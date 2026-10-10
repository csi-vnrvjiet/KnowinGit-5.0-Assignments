# array_reversal Component (`c/C13`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The in-place array reversal iterates across the entire length of the array, swapping elements twice and reverting them to original order.

## Module Interface
Declared in [`array_reversal.h`](array_reversal.h):
```c
// See array_reversal.h for full declarations and type definitions
```

### Expected Behavior
Reverse the complete array while preserving every value. Test odd- and even-length arrays.

### Acceptance Criteria
- Reversing [1, 2, 3, 4] results in [4, 3, 2, 1].
- Preserves the existing function signatures declared in `array_reversal.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C13
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C13 components/c/C13/*.c tests/c/C13/*.c -o test_runner
./test_runner
```
