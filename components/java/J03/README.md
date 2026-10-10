# PassingMarks Component (`java/J03`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The passing marks counter requires strictly greater than 40 marks instead of greater than or equal to 40, falsely failing students with exactly 40 marks.

## Module Interface
Implemented in [`PassingMarks.java`](PassingMarks.java):
```java
// See PassingMarks.java for method declarations and signatures
```

### Expected Behavior
Marks of 40 or more pass; marks below 40 fail. The function must return 2 for [39, 40, 41].

### Acceptance Criteria
- Marks equal to 40 are counted as passing. Returns 2 for [39, 40, 41] with threshold 40.
- Preserves the existing class structure and method signatures in `PassingMarks.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J03
```

Or compile and run manually:
```bash
javac -d tests/java/J03 components/java/J03/*.java tests/java/J03/*.java
java -cp tests/java/J03 PassingMarksTest
```
