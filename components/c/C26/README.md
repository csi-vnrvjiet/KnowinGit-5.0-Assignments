# word_counter Component (`c/C26`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The word counter counts words as spaces + 1, incorrectly inflating word counts when multiple consecutive spaces are present.

## Module Interface
Declared in [`word_counter.h`](word_counter.h):
```c
// See word_counter.h for full declarations and type definitions
```

### Expected Behavior
Count sequences of non-whitespace characters. 'one   two' must contain two words; an empty or whitespace string must contain zero.

### Acceptance Criteria
- count_words / countWords returns 2 for 'one   two' and 0 for empty string.
- Preserves the existing function signatures declared in `word_counter.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C26
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C26 components/c/C26/*.c tests/c/C26/*.c -o test_runner
./test_runner
```
