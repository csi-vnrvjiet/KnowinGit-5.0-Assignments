# BinarySearch Component (`java/J16`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The binary search implementation initializes low to 1 instead of 0, making it impossible to find a target stored at index 0.

## Module Interface
Implemented in [`BinarySearch.java`](BinarySearch.java):
```java
// See BinarySearch.java for method declarations and signatures
```

### Expected Behavior
Binary search must correctly find first, middle, and last elements, returning -1 for missing values.

### Acceptance Criteria
- binary_search / binarySearch returns 0 for target 10 in [10, 20, 30, 40, 50].
- Preserves the existing class structure and method signatures in `BinarySearch.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J16
```

Or compile and run manually:
```bash
javac -d tests/java/J16 components/java/J16/*.java tests/java/J16/*.java
java -cp tests/java/J16 BinarySearchTest
```
