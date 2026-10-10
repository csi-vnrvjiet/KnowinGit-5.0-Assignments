# stack_empty Component (`c/C37`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The pop operation does not decrement the top pointer below 0, leaving top at 0 instead of -1 when the final element is removed.

## Module Interface
Declared in [`stack_empty.h`](stack_empty.h):
```c
// See stack_empty.h for full declarations and type definitions
```

### Expected Behavior
After the only element is popped, the stack must report empty. A subsequent peek must return -1 without reading stale data.

### Acceptance Criteria
- is_empty returns 1 and peek returns -1 immediately after popping the only element.
- Preserves the existing function signatures declared in `stack_empty.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C37
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C37 components/c/C37/*.c tests/c/C37/*.c -o test_runner
./test_runner
```
