# space_remover Component (`c/C30`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
When shifting characters left to delete a space, the loop does not decrement its index, skipping the second space when two spaces occur consecutively.

## Module Interface
Declared in [`space_remover.h`](space_remover.h):
```c
// See space_remover.h for full declarations and type definitions
```

### Expected Behavior
Removing ordinary space characters from 'a  b c' must produce 'abc'. No other characters should be removed.

### Acceptance Criteria
- remove_all_spaces / removeAllSpaces turns 'a  b c' into 'abc'.
- Preserves the existing function signatures declared in `space_remover.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C30
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C30 components/c/C30/*.c tests/c/C30/*.c -o test_runner
./test_runner
```
