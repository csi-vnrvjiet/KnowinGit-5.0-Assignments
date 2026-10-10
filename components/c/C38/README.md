# stack_pop Component (`c/C38`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The pop operation decrements top by 2 instead of 1, corrupting the stack pointer and skipping the expected predecessor element.

## Module Interface
Declared in [`stack_pop.h`](stack_pop.h):
```c
// See stack_pop.h for full declarations and type definitions
```

### Expected Behavior
After pushing 10, 20 and 30, then popping once, peek must return 20. Preserve LIFO behavior.

### Acceptance Criteria
- peek returns 20 after pushing [10, 20, 30] and popping once.
- Preserves the existing function signatures declared in `stack_pop.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C38
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C38 components/c/C38/*.c tests/c/C38/*.c -o test_runner
./test_runner
```
