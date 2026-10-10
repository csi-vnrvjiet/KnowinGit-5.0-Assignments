# GradeCalculator Component (`java/J02`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The average calculator performs integer division instead of floating-point division, truncating fractional values.

## Module Interface
Implemented in [`GradeCalculator.java`](GradeCalculator.java):
```java
// See GradeCalculator.java for method declarations and signatures
```

### Expected Behavior
Averaging 80 and 81 must produce 80.5, not 80. Integer-valued averages like [70, 80, 90] must continue to produce 80.0.

### Acceptance Criteria
- calculate_average / calculateAverage returns 80.5 for [80, 81], 80.0 for [70, 80, 90], and 0.0 for empty arrays.
- Preserves the existing class structure and method signatures in `GradeCalculator.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J02
```

Or compile and run manually:
```bash
javac -d tests/java/J02 components/java/J02/*.java tests/java/J02/*.java
java -cp tests/java/J02 GradeCalculatorTest
```
