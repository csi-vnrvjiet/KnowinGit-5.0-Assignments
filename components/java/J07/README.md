# EvenCounter Component (`java/J07`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The even number counter stops iterating before checking the element at the final index.

## Module Interface
Implemented in [`EvenCounter.java`](EvenCounter.java):
```java
// See EvenCounter.java for method declarations and signatures
```

### Expected Behavior
Count every even value in the array, including one at the final position. Zero and negative values must be handled correctly.

### Acceptance Criteria
- Counting [1, 3, 5, 8] returns 1. Counting [-4, 0, 3] returns 2.
- Preserves the existing class structure and method signatures in `EvenCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J07
```

Or compile and run manually:
```bash
javac -d tests/java/J07 components/java/J07/*.java tests/java/J07/*.java
java -cp tests/java/J07 EvenCounterTest
```
