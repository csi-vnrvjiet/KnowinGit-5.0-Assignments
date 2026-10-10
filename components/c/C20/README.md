# second_highest Component (`c/C20`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
When duplicates of the highest value appear, the function sets the second-highest value equal to the highest duplicate instead of finding a strictly smaller distinct value.

## Module Interface
Declared in [`second_highest.h`](second_highest.h):
```c
// See second_highest.h for full declarations and type definitions
```

### Expected Behavior
For [9, 9, 7, 6], return 7. If fewer than two distinct values exist, return -1.

### Acceptance Criteria
- find_second_highest / findSecondHighest returns 7 for [9, 9, 7, 6].
- Preserves the existing function signatures declared in `second_highest.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C20
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C20 components/c/C20/*.c tests/c/C20/*.c -o test_runner
./test_runner
```
