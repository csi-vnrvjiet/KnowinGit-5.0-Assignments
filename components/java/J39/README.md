# QueueOrder Component (`java/J39`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The dequeue method increments front by 2 instead of 1, skipping the next element in the queue.

## Module Interface
Implemented in [`QueueOrder.java`](QueueOrder.java):
```java
// See QueueOrder.java for method declarations and signatures
```

### Expected Behavior
Enqueue A, B, and C; dequeue A; the front must now be B. Further removals must preserve FIFO order.

### Acceptance Criteria
- peek returns 'B' after enqueuing 'A', 'B', 'C' and dequeuing once.
- Preserves the existing class structure and method signatures in `QueueOrder.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J39
```

Or compile and run manually:
```bash
javac -d tests/java/J39 components/java/J39/*.java tests/java/J39/*.java
java -cp tests/java/J39 QueueOrderTest
```
