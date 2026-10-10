# ArraySum Component (`java/J08`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The array summation routine starts iterating at index 1 instead of index 0, omitting the initial element from the calculated sum.

## Module Interface
Implemented in [`ArraySum.java`](ArraySum.java):
```java
// See ArraySum.java for method declarations and signatures
```

### Expected Behavior
The sum must include all elements from index 0 to the final element.

### Acceptance Criteria
- Summing [-3, 2, 5] yields 4.
- Preserves the existing class structure and method signatures in `ArraySum.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J08
```

Or compile and run manually:
```bash
javac -d tests/java/J08 components/java/J08/*.java tests/java/J08/*.java
java -cp tests/java/J08 ArraySumTest
```
