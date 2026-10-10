# RemoveValue Component (`java/J15`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The element removal algorithm erroneously increments its iteration pointer when a target is found, skipping examination of adjacent elements.

## Module Interface
Implemented in [`RemoveValue.java`](RemoveValue.java):
```java
// See RemoveValue.java for method declarations and signatures
```

### Expected Behavior
Removing 3 from [3, 1, 3, 3, 2] must produce [1, 2] with a count of 2.

### Acceptance Criteria
- remove_all_occurrences / removeAllOccurrences produces [1, 2] and count 2 for input [3, 1, 3, 3, 2].
- Preserves the existing class structure and method signatures in `RemoveValue.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J15
```

Or compile and run manually:
```bash
javac -d tests/java/J15 components/java/J15/*.java tests/java/J15/*.java
java -cp tests/java/J15 RemoveValueTest
```
