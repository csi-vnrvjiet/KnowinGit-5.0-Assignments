# score_sorter Component (`c/C06`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
Ascending bubble sort terminates the inner comparison loop one iteration too early, leaving the final elements unsorted.

## Module Interface
Declared in [`score_sorter.h`](score_sorter.h):
```c
// See score_sorter.h for full declarations and type definitions
```

### Expected Behavior
Sorting must return values in ascending order, including the final element.

### Acceptance Criteria
- Sorting [5, 4, 3, 2, 1] produces [1, 2, 3, 4, 5].
- Preserves the existing function signatures declared in `score_sorter.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C06
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C06 components/c/C06/*.c tests/c/C06/*.c -o test_runner
./test_runner
```
