# CharSearch Component (`java/J28`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The character search loop starts indexing at 1 instead of 0, failing to match any character located at the start of the string.

## Module Interface
Implemented in [`CharSearch.java`](CharSearch.java):
```java
// See CharSearch.java for method declarations and signatures
```

### Expected Behavior
Character search must find a matching character at the first position and return -1 when absent.

### Acceptance Criteria
- find_char_index / findCharIndex returns 0 for 'a' in 'apple'.
- Preserves the existing class structure and method signatures in `CharSearch.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J28
```

Or compile and run manually:
```bash
javac -d tests/java/J28 components/java/J28/*.java tests/java/J28/*.java
java -cp tests/java/J28 CharSearchTest
```
