# array_sum Component (`c/C08`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The array summation routine starts iterating at index 1 instead of index 0, omitting the initial element from the calculated sum.

## Module Interface
Declared in [`array_sum.h`](array_sum.h):
```c
// See array_sum.h for full declarations and type definitions
```

### Expected Behavior
The sum must include all elements from index 0 to the final element.

### Acceptance Criteria
- Summing [-3, 2, 5] yields 4.
- Preserves the existing function signatures declared in `array_sum.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C08
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C08 components/c/C08/*.c tests/c/C08/*.c -o test_runner
./test_runner
```
