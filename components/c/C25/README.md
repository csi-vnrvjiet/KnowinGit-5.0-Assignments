# name_comparison Component (`c/C25`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The student name equality check enforces strict character case, falsely reporting that 'Rahul' and 'rAhUl' do not match.

## Module Interface
Declared in [`name_comparison.h`](name_comparison.h):
```c
// See name_comparison.h for full declarations and type definitions
```

### Expected Behavior
'Rahul' and 'rAhUl' must match, while 'Rahu' and 'Rahul' must not match.

### Acceptance Criteria
- compare_names_case_insensitive / compareNamesCaseInsensitive returns 1 for ('Rahul', 'rAhUl') and 0 for ('Rahu', 'Rahul').
- Preserves the existing function signatures declared in `name_comparison.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C25
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C25 components/c/C25/*.c tests/c/C25/*.c -o test_runner
./test_runner
```
