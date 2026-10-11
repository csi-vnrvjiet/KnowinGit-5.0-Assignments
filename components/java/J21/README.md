# Palindrome Component (`java/J21`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The palindrome checker uses an incorrect right-pointer starting position for even-length strings, misidentifying valid even-length palindromes as non-palindromes.

> **Note:** Method declarations and signatures are in [`Palindrome.java`](Palindrome.java).

### Expected Behavior
'abba' and 'level' must return true; 'hello' must return false.

### Acceptance Criteria
- is_palindrome / isPalindrome returns 1 (true) for 'abba' and 'level', and 0 (false) for 'hello'.
- Preserves the existing class structure and method signatures in `Palindrome.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J21
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J21
```
