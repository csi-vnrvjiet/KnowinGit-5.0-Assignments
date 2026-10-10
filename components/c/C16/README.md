# binary_search Component (`c/C16`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The binary search implementation initializes low to 1 instead of 0, making it impossible to find a target stored at index 0.

## Module Interface
Declared in [`binary_search.h`](binary_search.h):
```c
// See binary_search.h for full declarations and type definitions
```

### Expected Behavior
Binary search must correctly find first, middle, and last elements, returning -1 for missing values.

### Acceptance Criteria
- binary_search / binarySearch returns 0 for target 10 in [10, 20, 30, 40, 50].
- Preserves the existing function signatures declared in `binary_search.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C16
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C16 components/c/C16/*.c tests/c/C16/*.c -o test_runner
./test_runner
```
