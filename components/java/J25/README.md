# NameComparison Component (`java/J25`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The student name equality check enforces strict character case, falsely reporting that 'Rahul' and 'rAhUl' do not match.

## Module Interface
Implemented in [`NameComparison.java`](NameComparison.java):
```java
// See NameComparison.java for method declarations and signatures
```

### Expected Behavior
'Rahul' and 'rAhUl' must match, while 'Rahu' and 'Rahul' must not match.

### Acceptance Criteria
- compare_names_case_insensitive / compareNamesCaseInsensitive returns 1 for ('Rahul', 'rAhUl') and 0 for ('Rahu', 'Rahul').
- Preserves the existing class structure and method signatures in `NameComparison.java`.
- Conforms to standard Java 17+.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh java/J25
```

Or compile and run manually:
```bash
javac -d tests/java/J25 components/java/J25/*.java tests/java/J25/*.java
java -cp tests/java/J25 NameComparisonTest
```
