# remove_value Component (`c/C15`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The element removal algorithm erroneously increments its iteration pointer when a target is found, skipping examination of adjacent elements.

## Module Interface
Declared in [`remove_value.h`](remove_value.h):
```c
// See remove_value.h for full declarations and type definitions
```

### Expected Behavior
Removing 3 from [3, 1, 3, 3, 2] must produce [1, 2] with a count of 2.

### Acceptance Criteria
- remove_all_occurrences / removeAllOccurrences produces [1, 2] and count 2 for input [3, 1, 3, 3, 2].
- Preserves the existing function signatures declared in `remove_value.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C15
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C15 components/c/C15/*.c tests/c/C15/*.c -o test_runner
./test_runner
```
