# uppercase_counter Component (`c/C31`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The uppercase character counter begins iteration at index 1 instead of index 0, missing any uppercase letter located at the start of the string.

## Module Interface
Declared in [`uppercase_counter.h`](uppercase_counter.h):
```c
// See uppercase_counter.h for full declarations and type definitions
```

### Expected Behavior
Count every uppercase English letter, including the first character. For 'AbCde', the result is 2.

### Acceptance Criteria
- count_uppercase_letters / countUppercaseLetters returns 2 for 'AbCde'.
- Preserves the existing function signatures declared in `uppercase_counter.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C31
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C31 components/c/C31/*.c tests/c/C31/*.c -o test_runner
./test_runner
```
