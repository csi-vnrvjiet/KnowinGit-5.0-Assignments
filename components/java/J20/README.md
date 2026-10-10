# SecondHighest Component (`java/J20`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
When duplicates of the highest value appear, the function sets the second-highest value equal to the highest duplicate instead of finding a strictly smaller distinct value.

## Module Interface
Implemented in [`SecondHighest.java`](SecondHighest.java):
```java
// See SecondHighest.java for method declarations and signatures
```

### Expected Behavior
For [9, 9, 7, 6], return 7. If fewer than two distinct values exist, return -1.

### Acceptance Criteria
- find_second_highest / findSecondHighest returns 7 for [9, 9, 7, 6].
- Preserves the existing class structure and method signatures in `SecondHighest.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J20
```

Or compile and run manually:
```bash
javac -d tests/java/J20 components/java/J20/*.java tests/java/J20/*.java
java -cp tests/java/J20 SecondHighestTest
```
