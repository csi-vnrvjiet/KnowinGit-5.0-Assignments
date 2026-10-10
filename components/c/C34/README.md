# trailing_word_counter Component (`c/C34`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The word counter treats trailing spaces as word separators, falsely counting an extra phantom word.

## Module Interface
Declared in [`trailing_word_counter.h`](trailing_word_counter.h):
```c
// See trailing_word_counter.h for full declarations and type definitions
```

### Expected Behavior
Trailing spaces must not create an additional word. 'one two   ' must contain two words.

### Acceptance Criteria
- count_words_trailing / countWordsTrailing returns 2 for 'one two   '.
- Preserves the existing function signatures declared in `trailing_word_counter.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C34
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C34 components/c/C34/*.c tests/c/C34/*.c -o test_runner
./test_runner
```
