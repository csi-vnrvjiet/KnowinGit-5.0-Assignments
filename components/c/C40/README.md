# stack_capacity Component (`c/C40`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The stack capacity check allows top to reach capacity before rejecting, allowing a fourth push to exceed a capacity-3 stack.

## Module Interface
Declared in [`stack_capacity.h`](stack_capacity.h):
```c
// See stack_capacity.h for full declarations and type definitions
```

### Expected Behavior
A stack with capacity 3 must accept exactly three elements, reject a fourth, and correctly accept a new element after one item has been popped.

### Acceptance Criteria
- Pushing a 4th element into capacity 3 returns 0 (false). Pushing 3 elements succeeds.
- Preserves the existing function signatures declared in `stack_capacity.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C40
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C40 components/c/C40/*.c tests/c/C40/*.c -o test_runner
./test_runner
```
