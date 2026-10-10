# ScoreSorter Component (`java/J06`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
Ascending bubble sort terminates the inner comparison loop one iteration too early, leaving the final elements unsorted.

## Module Interface
Implemented in [`ScoreSorter.java`](ScoreSorter.java):
```java
// See ScoreSorter.java for method declarations and signatures
```

### Expected Behavior
Sorting must return values in ascending order, including the final element.

### Acceptance Criteria
- Sorting [5, 4, 3, 2, 1] produces [1, 2, 3, 4, 5].
- Preserves the existing class structure and method signatures in `ScoreSorter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J06
```

Or compile and run manually:
```bash
javac -d tests/java/J06 components/java/J06/*.java tests/java/J06/*.java
java -cp tests/java/J06 ScoreSorterTest
```
