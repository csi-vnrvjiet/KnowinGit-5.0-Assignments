# RangeCounter Component (`java/J18`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The range filter uses strict inequalities (> and <) rather than inclusive checks (>= and <=), ignoring boundary values.

## Module Interface
Implemented in [`RangeCounter.java`](RangeCounter.java):
```java
// See RangeCounter.java for method declarations and signatures
```

### Expected Behavior
Counting values within an inclusive range must include elements equal to the lower or upper bound.

### Acceptance Criteria
- count_in_range / countInRange returns 3 for [5, 10, 15, 20] with range [10, 20].
- Preserves the existing class structure and method signatures in `RangeCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J18
```

Or compile and run manually:
```bash
javac -d tests/java/J18 components/java/J18/*.java tests/java/J18/*.java
java -cp tests/java/J18 RangeCounterTest
```
