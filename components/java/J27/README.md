# StringReversal Component (`java/J27`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The string reversal algorithm runs its swap loop across all characters up to len, reversing characters twice and restoring original order.

## Module Interface
Implemented in [`StringReversal.java`](StringReversal.java):
```java
// See StringReversal.java for method declarations and signatures
```

### Expected Behavior
Reverse the entire string. 'college' must produce 'egelloc'. Empty and one-character strings must also behave correctly.

### Acceptance Criteria
- reverse_string / reverseString transforms 'college' into 'egelloc'.
- Preserves the existing class structure and method signatures in `StringReversal.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J27
```

Or compile and run manually:
```bash
javac -d tests/java/J27 components/java/J27/*.java tests/java/J27/*.java
java -cp tests/java/J27 StringReversalTest
```
