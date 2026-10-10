# LetterCounter Component (`java/J36`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The function counts any non-space character, erroneously including digits and punctuation symbols in the letter count.

## Module Interface
Implemented in [`LetterCounter.java`](LetterCounter.java):
```java
// See LetterCounter.java for method declarations and signatures
```

### Expected Behavior
Count English alphabetic characters while ignoring digits, spaces, and punctuation. For 'A1 b!', return 2.

### Acceptance Criteria
- count_letters_only / countLettersOnly returns 2 for 'A1 b!'.
- Preserves the existing class structure and method signatures in `LetterCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J36
```

Or compile and run manually:
```bash
javac -d tests/java/J36 components/java/J36/*.java tests/java/J36/*.java
java -cp tests/java/J36 LetterCounterTest
```
