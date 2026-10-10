# ExactMatch Component (`java/J24`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The comparison function performs a prefix match instead of an exact full match, mistakenly treating 'Ann' as matching 'Anna'.

## Module Interface
Implemented in [`ExactMatch.java`](ExactMatch.java):
```java
// See ExactMatch.java for method declarations and signatures
```

### Expected Behavior
'Ann' must not match 'Anna'. Identical strings must match. Case-sensitive.

### Acceptance Criteria
- is_exact_match / isExactMatch returns 0 for ('Ann', 'Anna') and 1 for ('John', 'John').
- Preserves the existing class structure and method signatures in `ExactMatch.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J24
```

Or compile and run manually:
```bash
javac -d tests/java/J24 components/java/J24/*.java tests/java/J24/*.java
java -cp tests/java/J24 ExactMatchTest
```
