# even_counter Component (`c/C07`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The even number counter stops iterating before checking the element at the final index.

## Module Interface
Declared in [`even_counter.h`](even_counter.h):
```c
// See even_counter.h for full declarations and type definitions
```

### Expected Behavior
Count every even value in the array, including one at the final position. Zero and negative values must be handled correctly.

### Acceptance Criteria
- Counting [1, 3, 5, 8] returns 1. Counting [-4, 0, 3] returns 2.
- Preserves the existing function signatures declared in `even_counter.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C07
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C07 components/c/C07/*.c tests/c/C07/*.c -o test_runner
./test_runner
```
