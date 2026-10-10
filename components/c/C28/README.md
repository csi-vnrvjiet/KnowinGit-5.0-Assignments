# char_search Component (`c/C28`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The character search loop starts indexing at 1 instead of 0, failing to match any character located at the start of the string.

## Module Interface
Declared in [`char_search.h`](char_search.h):
```c
// See char_search.h for full declarations and type definitions
```

### Expected Behavior
Character search must find a matching character at the first position and return -1 when absent.

### Acceptance Criteria
- find_char_index / findCharIndex returns 0 for 'a' in 'apple'.
- Preserves the existing function signatures declared in `char_search.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C28
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C28 components/c/C28/*.c tests/c/C28/*.c -o test_runner
./test_runner
```
