# StudentRecords Component (`java/J05`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
Removing a student record corrupts the remaining records because the left-shift loop stops one element too early.

## Module Interface
Implemented in [`StudentRecords.java`](StudentRecords.java):
```java
// See StudentRecords.java for method declarations and signatures
```

### Expected Behavior
Removing a record must preserve the order and contents of all remaining records.

### Acceptance Criteria
- Deleting 102 from [101, 102, 103, 104] results in [101, 103, 104] and count 3.
- Preserves the existing class structure and method signatures in `StudentRecords.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J05
```

Or compile and run manually:
```bash
javac -d tests/java/J05 components/java/J05/*.java tests/java/J05/*.java
java -cp tests/java/J05 StudentRecordsTest
```
