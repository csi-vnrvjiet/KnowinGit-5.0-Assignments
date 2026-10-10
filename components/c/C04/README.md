# student_registry Component (`c/C04`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The registration function checks for duplicates before adding an ID, but its validation loop stops before checking the final existing record.

## Module Interface
Declared in [`student_registry.h`](student_registry.h):
```c
// See student_registry.h for full declarations and type definitions
```

### Expected Behavior
Registration must reject an ID already present, including when the matching ID is the final existing record. Existing records must remain unchanged.

### Acceptance Criteria
- Registering 103 when [101, 102, 103] exists returns 0 (false) and keeps count at 3.
- Preserves the existing function signatures declared in `student_registry.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C04
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C04 components/c/C04/*.c tests/c/C04/*.c -o test_runner
./test_runner
```
