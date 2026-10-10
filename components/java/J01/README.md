# StudentSearch Component (`java/J01`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
Linear search fails to find the student ID when the target record is located at the final index of the array.

## Module Interface
Implemented in [`StudentSearch.java`](StudentSearch.java):
```java
// See StudentSearch.java for method declarations and signatures
```

### Expected Behavior
Searching the first, middle, and final array elements must return the correct index; a missing value must return -1.

### Acceptance Criteria
- Searching for 104 in [101, 102, 103, 104] returns index 3. Searching for 101 returns 0, 102 returns 1, and 999 returns -1.
- Preserves the existing class structure and method signatures in `StudentSearch.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J01
```

Or compile and run manually:
```bash
javac -d tests/java/J01 components/java/J01/*.java tests/java/J01/*.java
java -cp tests/java/J01 StudentSearchTest
```
