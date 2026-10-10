# occurrence_counter Component (`c/C11`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The occurrence counter stops scanning before inspecting the element at the final index.

## Module Interface
Declared in [`occurrence_counter.h`](occurrence_counter.h):
```c
// See occurrence_counter.h for full declarations and type definitions
```

### Expected Behavior
Count every occurrence of the requested value, including occurrences at the final index.

### Acceptance Criteria
- Counting 2 in [2, 3, 5, 2] returns 2. Absent values return 0.
- Preserves the existing function signatures declared in `occurrence_counter.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C11
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C11 components/c/C11/*.c tests/c/C11/*.c -o test_runner
./test_runner
```
