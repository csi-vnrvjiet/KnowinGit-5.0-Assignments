# UppercaseCounter Component (`java/J31`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The uppercase character counter begins iteration at index 1 instead of index 0, missing any uppercase letter located at the start of the string.

## Module Interface
Implemented in [`UppercaseCounter.java`](UppercaseCounter.java):
```java
// See UppercaseCounter.java for method declarations and signatures
```

### Expected Behavior
Count every uppercase English letter, including the first character. For 'AbCde', the result is 2.

### Acceptance Criteria
- count_uppercase_letters / countUppercaseLetters returns 2 for 'AbCde'.
- Preserves the existing class structure and method signatures in `UppercaseCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J31
```

Or compile and run manually:
```bash
javac -d tests/java/J31 components/java/J31/*.java tests/java/J31/*.java
java -cp tests/java/J31 UppercaseCounterTest
```
