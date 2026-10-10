# letter_counter Component (`c/C36`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The function counts any non-space character, erroneously including digits and punctuation symbols in the letter count.

## Module Interface
Declared in [`letter_counter.h`](letter_counter.h):
```c
// See letter_counter.h for full declarations and type definitions
```

### Expected Behavior
Count English alphabetic characters while ignoring digits, spaces, and punctuation. For 'A1 b!', return 2.

### Acceptance Criteria
- count_letters_only / countLettersOnly returns 2 for 'A1 b!'.
- Preserves the existing function signatures declared in `letter_counter.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C36
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C36 components/c/C36/*.c tests/c/C36/*.c -o test_runner
./test_runner
```
