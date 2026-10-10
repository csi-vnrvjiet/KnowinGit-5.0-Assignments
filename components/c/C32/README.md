# boundary_matcher Component (`c/C32`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The function checking if a string starts and ends with the same character prematurely rejects single-character strings.

## Module Interface
Declared in [`boundary_matcher.h`](boundary_matcher.h):
```c
// See boundary_matcher.h for full declarations and type definitions
```

### Expected Behavior
The helper must return true for 'a', true for 'aba', and false for 'ab'.

### Acceptance Criteria
- starts_and_ends_with_same_char / startsAndEndsWithSameChar returns 1 (true) for 'a' and 'aba', 0 (false) for 'ab'.
- Preserves the existing function signatures declared in `boundary_matcher.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C32
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C32 components/c/C32/*.c tests/c/C32/*.c -o test_runner
./test_runner
```
