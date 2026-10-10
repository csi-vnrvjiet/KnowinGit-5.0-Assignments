# WordCounter Component (`java/J26`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The word counter counts words as spaces + 1, incorrectly inflating word counts when multiple consecutive spaces are present.

## Module Interface
Implemented in [`WordCounter.java`](WordCounter.java):
```java
// See WordCounter.java for method declarations and signatures
```

### Expected Behavior
Count sequences of non-whitespace characters. 'one   two' must contain two words; an empty or whitespace string must contain zero.

### Acceptance Criteria
- count_words / countWords returns 2 for 'one   two' and 0 for empty string.
- Preserves the existing class structure and method signatures in `WordCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J26
```

Or compile and run manually:
```bash
javac -d tests/java/J26 components/java/J26/*.java tests/java/J26/*.java
java -cp tests/java/J26 WordCounterTest
```
