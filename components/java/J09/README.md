# MaxFinder Component (`java/J09`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The maximum finder initializes its candidate value to 0, causing it to return 0 when all array elements are negative.

## Module Interface
Implemented in [`MaxFinder.java`](MaxFinder.java):
```java
// See MaxFinder.java for method declarations and signatures
```

### Expected Behavior
For [-8, -3, -11], the maximum must be -3. Single-element and mixed arrays must also return the correct maximum.

### Acceptance Criteria
- find_maximum / findMaximum returns -3 for [-8, -3, -11].
- Preserves the existing class structure and method signatures in `MaxFinder.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J09
```

Or compile and run manually:
```bash
javac -d tests/java/J09 components/java/J09/*.java tests/java/J09/*.java
java -cp tests/java/J09 MaxFinderTest
```
