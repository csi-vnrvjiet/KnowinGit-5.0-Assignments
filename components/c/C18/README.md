# range_counter Component (`c/C18`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The range filter uses strict inequalities (> and <) rather than inclusive checks (>= and <=), ignoring boundary values.

## Module Interface
Declared in [`range_counter.h`](range_counter.h):
```c
// See range_counter.h for full declarations and type definitions
```

### Expected Behavior
Counting values within an inclusive range must include elements equal to the lower or upper bound.

### Acceptance Criteria
- count_in_range / countInRange returns 3 for [5, 10, 15, 20] with range [10, 20].
- Preserves the existing function signatures declared in `range_counter.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C18
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C18 components/c/C18/*.c tests/c/C18/*.c -o test_runner
./test_runner
```
