# OccurrenceCounter Component (`java/J11`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The occurrence counter stops scanning before inspecting the element at the final index.

## Module Interface
Implemented in [`OccurrenceCounter.java`](OccurrenceCounter.java):
```java
// See OccurrenceCounter.java for method declarations and signatures
```

### Expected Behavior
Count every occurrence of the requested value, including occurrences at the final index.

### Acceptance Criteria
- Counting 2 in [2, 3, 5, 2] returns 2. Absent values return 0.
- Preserves the existing class structure and method signatures in `OccurrenceCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J11
```

Or compile and run manually:
```bash
javac -d tests/java/J11 components/java/J11/*.java tests/java/J11/*.java
java -cp tests/java/J11 OccurrenceCounterTest
```
