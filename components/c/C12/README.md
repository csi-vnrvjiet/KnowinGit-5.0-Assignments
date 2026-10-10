# first_index Component (`c/C12`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The linear search routine does not break upon finding a match, returning the last occurrence index instead of the first.

## Module Interface
Declared in [`first_index.h`](first_index.h):
```c
// See first_index.h for full declarations and type definitions
```

### Expected Behavior
For [4, 7, 4], searching for 4 must return index 0. If absent, return -1.

### Acceptance Criteria
- find_first_index / findFirstIndex returns 0 for target 4 in [4, 7, 4].
- Preserves the existing function signatures declared in `first_index.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C12
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C12 components/c/C12/*.c tests/c/C12/*.c -o test_runner
./test_runner
```
