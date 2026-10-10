# CharReplace Component (`java/J29`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The replacement routine breaks out of its traversal loop after modifying the first matching character, leaving subsequent occurrences untouched.

## Module Interface
Implemented in [`CharReplace.java`](CharReplace.java):
```java
// See CharReplace.java for method declarations and signatures
```

### Expected Behavior
Replacing 'a' with 'o' in 'banana' must produce 'bonono'. All matching occurrences must be replaced.

### Acceptance Criteria
- replace_all_chars / replaceAllChars turns 'banana' into 'bonono'.
- Preserves the existing class structure and method signatures in `CharReplace.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J29
```

Or compile and run manually:
```bash
javac -d tests/java/J29 components/java/J29/*.java tests/java/J29/*.java
java -cp tests/java/J29 CharReplaceTest
```
