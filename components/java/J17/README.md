# LeftRotate Component (`java/J17`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The left rotation helper assigns array[0] (which was already overwritten) to the final index instead of the saved initial element.

## Module Interface
Implemented in [`LeftRotate.java`](LeftRotate.java):
```java
// See LeftRotate.java for method declarations and signatures
```

### Expected Behavior
Rotating [1, 2, 3, 4] left once must produce [2, 3, 4, 1]. One-element arrays must remain unchanged.

### Acceptance Criteria
- rotate_left / rotateLeft turns [1, 2, 3, 4] into [2, 3, 4, 1].
- Preserves the existing class structure and method signatures in `LeftRotate.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J17
```

Or compile and run manually:
```bash
javac -d tests/java/J17 components/java/J17/*.java tests/java/J17/*.java
java -cp tests/java/J17 LeftRotateTest
```
