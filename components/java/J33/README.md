# SpaceTrimmer Component (`java/J33`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The trimming helper uses single if-statements rather than loops, removing at most one leading and one trailing space.

## Module Interface
Implemented in [`SpaceTrimmer.java`](SpaceTrimmer.java):
```java
// See SpaceTrimmer.java for method declarations and signatures
```

### Expected Behavior
Remove all leading and trailing ordinary spaces, preserving internal spaces.

### Acceptance Criteria
- trim_spaces / trimSpaces transforms '   Rahul Kumar  ' into 'Rahul Kumar'.
- Preserves the existing class structure and method signatures in `SpaceTrimmer.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J33
```

Or compile and run manually:
```bash
javac -d tests/java/J33 components/java/J33/*.java tests/java/J33/*.java
java -cp tests/java/J33 SpaceTrimmerTest
```
