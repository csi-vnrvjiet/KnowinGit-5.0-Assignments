# max_finder Component (`c/C09`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The maximum finder initializes its candidate value to 0, causing it to return 0 when all array elements are negative.

## Module Interface
Declared in [`max_finder.h`](max_finder.h):
```c
// See max_finder.h for full declarations and type definitions
```

### Expected Behavior
For [-8, -3, -11], the maximum must be -3. Single-element and mixed arrays must also return the correct maximum.

### Acceptance Criteria
- find_maximum / findMaximum returns -3 for [-8, -3, -11].
- Preserves the existing function signatures declared in `max_finder.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C09
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C09 components/c/C09/*.c tests/c/C09/*.c -o test_runner
./test_runner
```
