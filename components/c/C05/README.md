# student_records Component (`c/C05`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
Removing a student record corrupts the remaining records because the left-shift loop stops one element too early.

## Module Interface
Declared in [`student_records.h`](student_records.h):
```c
// See student_records.h for full declarations and type definitions
```

### Expected Behavior
Removing a record must preserve the order and contents of all remaining records.

### Acceptance Criteria
- Deleting 102 from [101, 102, 103, 104] results in [101, 103, 104] and count 3.
- Preserves the existing function signatures declared in `student_records.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C05
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C05 components/c/C05/*.c tests/c/C05/*.c -o test_runner
./test_runner
```
