# vowel_counter Component (`c/C22`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The vowel counter loop stops before evaluating the final character in the string.

## Module Interface
Declared in [`vowel_counter.h`](vowel_counter.h):
```c
// See vowel_counter.h for full declarations and type definitions
```

### Expected Behavior
Count vowels case-insensitively, including a vowel at the final position. For 'area', the result is 3.

### Acceptance Criteria
- count_vowels / countVowels returns 3 for 'area'.
- Preserves the existing function signatures declared in `vowel_counter.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C22
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C22 components/c/C22/*.c tests/c/C22/*.c -o test_runner
./test_runner
```
