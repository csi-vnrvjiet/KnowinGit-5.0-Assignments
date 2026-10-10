# MinFinder Component (`java/J10`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The minimum finder initializes its candidate value to 0, causing it to return 0 instead of the lowest value in positive arrays.

## Module Interface
Implemented in [`MinFinder.java`](MinFinder.java):
```java
// See MinFinder.java for method declarations and signatures
```

### Expected Behavior
For [8, 3, 11], the minimum must be 3. Single-element arrays must also be handled correctly.

### Acceptance Criteria
- find_minimum / findMinimum returns 3 for [8, 3, 11].
- Preserves the existing class structure and method signatures in `MinFinder.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J10
```

Or compile and run manually:
```bash
javac -d tests/java/J10 components/java/J10/*.java tests/java/J10/*.java
java -cp tests/java/J10 MinFinderTest
```
