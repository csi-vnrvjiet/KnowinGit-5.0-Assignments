# SpaceRemover Component (`java/J30`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
When shifting characters left to delete a space, the loop does not decrement its index, skipping the second space when two spaces occur consecutively.

## Module Interface
Implemented in [`SpaceRemover.java`](SpaceRemover.java):
```java
// See SpaceRemover.java for method declarations and signatures
```

### Expected Behavior
Removing ordinary space characters from 'a  b c' must produce 'abc'. No other characters should be removed.

### Acceptance Criteria
- remove_all_spaces / removeAllSpaces turns 'a  b c' into 'abc'.
- Preserves the existing class structure and method signatures in `SpaceRemover.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J30
```

Or compile and run manually:
```bash
javac -d tests/java/J30 components/java/J30/*.java tests/java/J30/*.java
java -cp tests/java/J30 SpaceRemoverTest
```
