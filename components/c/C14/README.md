# array_list_insert Component (`c/C14`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The insert helper rejects insertions where index == count, disallowing valid appends to the end of the list.

## Module Interface
Declared in [`array_list_insert.h`](array_list_insert.h):
```c
// See array_list_insert.h for full declarations and type definitions
```

### Expected Behavior
Inserting at the valid append position (index == count) must succeed without losing existing elements.

### Acceptance Criteria
- Inserting at index 3 in [10, 20, 30] succeeds, setting array[3] = 40 and count to 4.
- Preserves the existing function signatures declared in `array_list_insert.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C14
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C14 components/c/C14/*.c tests/c/C14/*.c -o test_runner
./test_runner
```
