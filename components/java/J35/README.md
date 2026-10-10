# LongestName Component (`java/J35`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The search loop stops before inspecting the final name in the record array, missing the longest name when placed at the end.

## Module Interface
Implemented in [`LongestName.java`](LongestName.java):
```java
// See LongestName.java for method declarations and signatures
```

### Expected Behavior
Check every record, including the final one. If names tie in length, return the first matching record.

### Acceptance Criteria
- find_longest_name / findLongestName returns 'Christopher' for ['Bob', 'Alice', 'Christopher'].
- Preserves the existing class structure and method signatures in `LongestName.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J35
```

Or compile and run manually:
```bash
javac -d tests/java/J35 components/java/J35/*.java tests/java/J35/*.java
java -cp tests/java/J35 LongestNameTest
```
