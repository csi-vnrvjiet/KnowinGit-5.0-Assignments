# Palindrome Component (`java/J21`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The palindrome checker uses an incorrect right-pointer starting position for even-length strings, misidentifying valid even-length palindromes as non-palindromes.

## Module Interface
Implemented in [`Palindrome.java`](Palindrome.java):
```java
// See Palindrome.java for method declarations and signatures
```

### Expected Behavior
'abba' and 'level' must return true; 'hello' must return false.

### Acceptance Criteria
- is_palindrome / isPalindrome returns 1 (true) for 'abba' and 'level', and 0 (false) for 'hello'.
- Preserves the existing class structure and method signatures in `Palindrome.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J21
```

Or compile and run manually:
```bash
javac -d tests/java/J21 components/java/J21/*.java tests/java/J21/*.java
java -cp tests/java/J21 PalindromeTest
```
