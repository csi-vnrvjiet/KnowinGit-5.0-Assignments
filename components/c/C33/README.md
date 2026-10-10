# space_trimmer Component (`c/C33`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The trimming helper uses single if-statements rather than loops, removing at most one leading and one trailing space.

## Module Interface
Declared in [`space_trimmer.h`](space_trimmer.h):
```c
// See space_trimmer.h for full declarations and type definitions
```

### Expected Behavior
Remove all leading and trailing ordinary spaces, preserving internal spaces.

### Acceptance Criteria
- trim_spaces / trimSpaces transforms '   Rahul Kumar  ' into 'Rahul Kumar'.
- Preserves the existing function signatures declared in `space_trimmer.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C33
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C33 components/c/C33/*.c tests/c/C33/*.c -o test_runner
./test_runner
```
