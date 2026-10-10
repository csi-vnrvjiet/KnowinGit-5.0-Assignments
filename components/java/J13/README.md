# ArrayReversal Component (`java/J13`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The in-place array reversal iterates across the entire length of the array, swapping elements twice and reverting them to original order.

## Module Interface
Implemented in [`ArrayReversal.java`](ArrayReversal.java):
```java
// See ArrayReversal.java for method declarations and signatures
```

### Expected Behavior
Reverse the complete array while preserving every value. Test odd- and even-length arrays.

### Acceptance Criteria
- Reversing [1, 2, 3, 4] results in [4, 3, 2, 1].
- Preserves the existing class structure and method signatures in `ArrayReversal.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J13
```

Or compile and run manually:
```bash
javac -d tests/java/J13 components/java/J13/*.java tests/java/J13/*.java
java -cp tests/java/J13 ArrayReversalTest
```
