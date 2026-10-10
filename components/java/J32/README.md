# BoundaryMatcher Component (`java/J32`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The function checking if a string starts and ends with the same character prematurely rejects single-character strings.

## Module Interface
Implemented in [`BoundaryMatcher.java`](BoundaryMatcher.java):
```java
// See BoundaryMatcher.java for method declarations and signatures
```

### Expected Behavior
The helper must return true for 'a', true for 'aba', and false for 'ab'.

### Acceptance Criteria
- starts_and_ends_with_same_char / startsAndEndsWithSameChar returns 1 (true) for 'a' and 'aba', 0 (false) for 'ab'.
- Preserves the existing class structure and method signatures in `BoundaryMatcher.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J32
```

Or compile and run manually:
```bash
javac -d tests/java/J32 components/java/J32/*.java tests/java/J32/*.java
java -cp tests/java/J32 BoundaryMatcherTest
```
