# digit_counter Component (`c/C23`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The digit counter loop finishes one position early, ignoring digits located at the final character position.

## Module Interface
Declared in [`digit_counter.h`](digit_counter.h):
```c
// See digit_counter.h for full declarations and type definitions
```

### Expected Behavior
Count every digit, including the final character. For 'a7b2', the result is 2.

### Acceptance Criteria
- count_digits / countDigits returns 2 for 'a7b2'.
- Preserves the existing function signatures declared in `digit_counter.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C23
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C23 components/c/C23/*.c tests/c/C23/*.c -o test_runner
./test_runner
```
