# longest_name Component (`c/C35`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The search loop stops before inspecting the final name in the record array, missing the longest name when placed at the end.

## Module Interface
Declared in [`longest_name.h`](longest_name.h):
```c
// See longest_name.h for full declarations and type definitions
```

### Expected Behavior
Check every record, including the final one. If names tie in length, return the first matching record.

### Acceptance Criteria
- find_longest_name / findLongestName returns 'Christopher' for ['Bob', 'Alice', 'Christopher'].
- Preserves the existing function signatures declared in `longest_name.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C35
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C35 components/c/C35/*.c tests/c/C35/*.c -o test_runner
./test_runner
```
