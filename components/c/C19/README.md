# max_index Component (`c/C19`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The function returns the maximum element's value instead of its array index.

## Module Interface
Declared in [`max_index.h`](max_index.h):
```c
// See max_index.h for full declarations and type definitions
```

### Expected Behavior
Return the index of the maximum value. When multiple maximum values exist, return the first index.

### Acceptance Criteria
- find_max_index / findMaxIndex returns 1 for [10, 50, 20]. Empty array returns -1.
- Preserves the existing function signatures declared in `max_index.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C19
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C19 components/c/C19/*.c tests/c/C19/*.c -o test_runner
./test_runner
```
