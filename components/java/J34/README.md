# TrailingWordCounter Component (`java/J34`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The word counter treats trailing spaces as word separators, falsely counting an extra phantom word.

## Module Interface
Implemented in [`TrailingWordCounter.java`](TrailingWordCounter.java):
```java
// See TrailingWordCounter.java for method declarations and signatures
```

### Expected Behavior
Trailing spaces must not create an additional word. 'one two   ' must contain two words.

### Acceptance Criteria
- count_words_trailing / countWordsTrailing returns 2 for 'one two   '.
- Preserves the existing class structure and method signatures in `TrailingWordCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J34
```

Or compile and run manually:
```bash
javac -d tests/java/J34 components/java/J34/*.java tests/java/J34/*.java
java -cp tests/java/J34 TrailingWordCounterTest
```
