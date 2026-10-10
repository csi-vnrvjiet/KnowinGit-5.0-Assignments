# char_replace Component (`c/C29`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The replacement routine breaks out of its traversal loop after modifying the first matching character, leaving subsequent occurrences untouched.

## Module Interface
Declared in [`char_replace.h`](char_replace.h):
```c
// See char_replace.h for full declarations and type definitions
```

### Expected Behavior
Replacing 'a' with 'o' in 'banana' must produce 'bonono'. All matching occurrences must be replaced.

### Acceptance Criteria
- replace_all_chars / replaceAllChars turns 'banana' into 'bonono'.
- Preserves the existing function signatures declared in `char_replace.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C29
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C29 components/c/C29/*.c tests/c/C29/*.c -o test_runner
./test_runner
```
