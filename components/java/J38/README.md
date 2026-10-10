# StackPop Component (`java/J38`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The pop operation decrements top by 2 instead of 1, corrupting the stack pointer and skipping the expected predecessor element.

## Module Interface
Implemented in [`StackPop.java`](StackPop.java):
```java
// See StackPop.java for method declarations and signatures
```

### Expected Behavior
After pushing 10, 20 and 30, then popping once, peek must return 20. Preserve LIFO behavior.

### Acceptance Criteria
- peek returns 20 after pushing [10, 20, 30] and popping once.
- Preserves the existing class structure and method signatures in `StackPop.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J38
```

Or compile and run manually:
```bash
javac -d tests/java/J38 components/java/J38/*.java tests/java/J38/*.java
java -cp tests/java/J38 StackPopTest
```
