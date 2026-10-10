# exact_match Component (`c/C24`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The comparison function performs a prefix match instead of an exact full match, mistakenly treating 'Ann' as matching 'Anna'.

## Module Interface
Declared in [`exact_match.h`](exact_match.h):
```c
// See exact_match.h for full declarations and type definitions
```

### Expected Behavior
'Ann' must not match 'Anna'. Identical strings must match. Case-sensitive.

### Acceptance Criteria
- is_exact_match / isExactMatch returns 0 for ('Ann', 'Anna') and 1 for ('John', 'John').
- Preserves the existing function signatures declared in `exact_match.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C24
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C24 components/c/C24/*.c tests/c/C24/*.c -o test_runner
./test_runner
```
