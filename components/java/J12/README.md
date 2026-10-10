# FirstIndex Component (`java/J12`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The linear search routine does not break upon finding a match, returning the last occurrence index instead of the first.

## Module Interface
Implemented in [`FirstIndex.java`](FirstIndex.java):
```java
// See FirstIndex.java for method declarations and signatures
```

### Expected Behavior
For [4, 7, 4], searching for 4 must return index 0. If absent, return -1.

### Acceptance Criteria
- find_first_index / findFirstIndex returns 0 for target 4 in [4, 7, 4].
- Preserves the existing class structure and method signatures in `FirstIndex.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J12
```

Or compile and run manually:
```bash
javac -d tests/java/J12 components/java/J12/*.java tests/java/J12/*.java
java -cp tests/java/J12 FirstIndexTest
```
