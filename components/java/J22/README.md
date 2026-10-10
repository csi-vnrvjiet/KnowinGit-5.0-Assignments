# VowelCounter Component (`java/J22`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The vowel counter loop stops before evaluating the final character in the string.

## Module Interface
Implemented in [`VowelCounter.java`](VowelCounter.java):
```java
// See VowelCounter.java for method declarations and signatures
```

### Expected Behavior
Count vowels case-insensitively, including a vowel at the final position. For 'area', the result is 3.

### Acceptance Criteria
- count_vowels / countVowels returns 3 for 'area'.
- Preserves the existing class structure and method signatures in `VowelCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J22
```

Or compile and run manually:
```bash
javac -d tests/java/J22 components/java/J22/*.java tests/java/J22/*.java
java -cp tests/java/J22 VowelCounterTest
```
