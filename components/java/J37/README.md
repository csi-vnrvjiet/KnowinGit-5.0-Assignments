# StackEmpty Component (`java/J37`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The pop operation does not decrement the top pointer below 0, leaving top at 0 instead of -1 when the final element is removed.

## Module Interface
Implemented in [`StackEmpty.java`](StackEmpty.java):
```java
// See StackEmpty.java for method declarations and signatures
```

### Expected Behavior
After the only element is popped, the stack must report empty. A subsequent peek must return -1 without reading stale data.

### Acceptance Criteria
- is_empty returns 1 and peek returns -1 immediately after popping the only element.
- Preserves the existing class structure and method signatures in `StackEmpty.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J37
```

Or compile and run manually:
```bash
javac -d tests/java/J37 components/java/J37/*.java tests/java/J37/*.java
java -cp tests/java/J37 StackEmptyTest
```
