# student_search Component (`c/C01`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
Linear search fails to find the student ID when the target record is located at the final index of the array.

## Module Interface
Declared in [`student_search.h`](student_search.h):
```c
// See student_search.h for full declarations and type definitions
```

### Expected Behavior
Searching the first, middle, and final array elements must return the correct index; a missing value must return -1.

### Acceptance Criteria
- Searching for 104 in [101, 102, 103, 104] returns index 3. Searching for 101 returns 0, 102 returns 1, and 999 returns -1.
- Preserves the existing function signatures declared in `student_search.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C01
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C01 components/c/C01/*.c tests/c/C01/*.c -o test_runner
./test_runner
```
