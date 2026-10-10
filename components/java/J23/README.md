# DigitCounter Component (`java/J23`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The digit counter loop finishes one position early, ignoring digits located at the final character position.

## Module Interface
Implemented in [`DigitCounter.java`](DigitCounter.java):
```java
// See DigitCounter.java for method declarations and signatures
```

### Expected Behavior
Count every digit, including the final character. For 'a7b2', the result is 2.

### Acceptance Criteria
- count_digits / countDigits returns 2 for 'a7b2'.
- Preserves the existing class structure and method signatures in `DigitCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J23
```

Or compile and run manually:
```bash
javac -d tests/java/J23 components/java/J23/*.java tests/java/J23/*.java
java -cp tests/java/J23 DigitCounterTest
```
