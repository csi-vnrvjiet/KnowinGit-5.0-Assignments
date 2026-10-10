# MaxIndex Component (`java/J19`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The function returns the maximum element's value instead of its array index.

## Module Interface
Implemented in [`MaxIndex.java`](MaxIndex.java):
```java
// See MaxIndex.java for method declarations and signatures
```

### Expected Behavior
Return the index of the maximum value. When multiple maximum values exist, return the first index.

### Acceptance Criteria
- find_max_index / findMaxIndex returns 1 for [10, 50, 20]. Empty array returns -1.
- Preserves the existing class structure and method signatures in `MaxIndex.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J19
```

Or compile and run manually:
```bash
javac -d tests/java/J19 components/java/J19/*.java tests/java/J19/*.java
java -cp tests/java/J19 MaxIndexTest
```
