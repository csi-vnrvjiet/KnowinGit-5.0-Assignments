# StudentRegistry Component (`java/J04`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The registration function checks for duplicates before adding an ID, but its validation loop stops before checking the final existing record.

## Module Interface
Implemented in [`StudentRegistry.java`](StudentRegistry.java):
```java
// See StudentRegistry.java for method declarations and signatures
```

### Expected Behavior
Registration must reject an ID already present, including when the matching ID is the final existing record. Existing records must remain unchanged.

### Acceptance Criteria
- Registering 103 when [101, 102, 103] exists returns 0 (false) and keeps count at 3.
- Preserves the existing class structure and method signatures in `StudentRegistry.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J04
```

Or compile and run manually:
```bash
javac -d tests/java/J04 components/java/J04/*.java tests/java/J04/*.java
java -cp tests/java/J04 StudentRegistryTest
```
