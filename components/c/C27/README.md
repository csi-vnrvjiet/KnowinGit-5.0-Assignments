# string_reversal Component (`c/C27`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The string reversal algorithm runs its swap loop across all characters up to len, reversing characters twice and restoring original order.

## Module Interface
Declared in [`string_reversal.h`](string_reversal.h):
```c
// See string_reversal.h for full declarations and type definitions
```

### Expected Behavior
Reverse the entire string. 'college' must produce 'egelloc'. Empty and one-character strings must also behave correctly.

### Acceptance Criteria
- reverse_string / reverseString transforms 'college' into 'egelloc'.
- Preserves the existing function signatures declared in `string_reversal.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C27
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C27 components/c/C27/*.c tests/c/C27/*.c -o test_runner
./test_runner
```
