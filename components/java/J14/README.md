# ArrayListInsert Component (`java/J14`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The insert helper rejects insertions where index == count, disallowing valid appends to the end of the list.

## Module Interface
Implemented in [`ArrayListInsert.java`](ArrayListInsert.java):
```java
// See ArrayListInsert.java for method declarations and signatures
```

### Expected Behavior
Inserting at the valid append position (index == count) must succeed without losing existing elements.

### Acceptance Criteria
- Inserting at index 3 in [10, 20, 30] succeeds, setting array[3] = 40 and count to 4.
- Preserves the existing class structure and method signatures in `ArrayListInsert.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J14
```

Or compile and run manually:
```bash
javac -d tests/java/J14 components/java/J14/*.java tests/java/J14/*.java
java -cp tests/java/J14 ArrayListInsertTest
```
