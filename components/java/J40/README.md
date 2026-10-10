# StackCapacity Component (`java/J40`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The stack capacity check allows top to reach capacity before rejecting, allowing a fourth push to exceed a capacity-3 stack.

## Module Interface
Implemented in [`StackCapacity.java`](StackCapacity.java):
```java
// See StackCapacity.java for method declarations and signatures
```

### Expected Behavior
A stack with capacity 3 must accept exactly three elements, reject a fourth, and correctly accept a new element after one item has been popped.

### Acceptance Criteria
- Pushing a 4th element into capacity 3 returns 0 (false). Pushing 3 elements succeeds.
- Preserves the existing class structure and method signatures in `StackCapacity.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J40
```

Or compile and run manually:
```bash
javac -d tests/java/J40 components/java/J40/*.java tests/java/J40/*.java
java -cp tests/java/J40 StackCapacityTest
```
