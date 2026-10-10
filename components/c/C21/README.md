# palindrome Component (`c/C21`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The palindrome checker uses an incorrect right-pointer starting position for even-length strings, misidentifying valid even-length palindromes as non-palindromes.

## Module Interface
Declared in [`palindrome.h`](palindrome.h):
```c
// See palindrome.h for full declarations and type definitions
```

### Expected Behavior
'abba' and 'level' must return true; 'hello' must return false.

### Acceptance Criteria
- is_palindrome / isPalindrome returns 1 (true) for 'abba' and 'level', and 0 (false) for 'hello'.
- Preserves the existing function signatures declared in `palindrome.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C21
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C21 components/c/C21/*.c tests/c/C21/*.c -o test_runner
./test_runner
```
