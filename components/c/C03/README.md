# passing_marks Component (`c/C03`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The passing marks counter requires strictly greater than 40 marks instead of greater than or equal to 40, falsely failing students with exactly 40 marks.

## Module Interface
Declared in [`passing_marks.h`](passing_marks.h):
```c
// See passing_marks.h for full declarations and type definitions
```

### Expected Behavior
Marks of 40 or more pass; marks below 40 fail. The function must return 2 for [39, 40, 41].

### Acceptance Criteria
- Marks equal to 40 are counted as passing. Returns 2 for [39, 40, 41] with threshold 40.
- Preserves the existing function signatures declared in `passing_marks.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C03
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C03 components/c/C03/*.c tests/c/C03/*.c -o test_runner
./test_runner
```
