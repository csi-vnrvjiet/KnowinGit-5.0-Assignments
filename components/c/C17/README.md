# left_rotate Component (`c/C17`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The left rotation helper assigns array[0] (which was already overwritten) to the final index instead of the saved initial element.

## Module Interface
Declared in [`left_rotate.h`](left_rotate.h):
```c
// See left_rotate.h for full declarations and type definitions
```

### Expected Behavior
Rotating [1, 2, 3, 4] left once must produce [2, 3, 4, 1]. One-element arrays must remain unchanged.

### Acceptance Criteria
- rotate_left / rotateLeft turns [1, 2, 3, 4] into [2, 3, 4, 1].
- Preserves the existing function signatures declared in `left_rotate.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C17
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C17 components/c/C17/*.c tests/c/C17/*.c -o test_runner
./test_runner
```
