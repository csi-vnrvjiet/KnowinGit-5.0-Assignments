# palindrome Component (`c/C21`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The palindrome checker uses an incorrect right-pointer starting position for even-length strings, misidentifying valid even-length palindromes as non-palindromes.

> **Note:** Function declarations are in [`palindrome.h`](palindrome.h).

### Expected Behavior
'abba' and 'level' must return true; 'hello' must return false.

### Acceptance Criteria
- is_palindrome / isPalindrome returns 1 (true) for 'abba' and 'level', and 0 (false) for 'hello'.
- Preserves the existing function signatures declared in `palindrome.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C21
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C21
```
