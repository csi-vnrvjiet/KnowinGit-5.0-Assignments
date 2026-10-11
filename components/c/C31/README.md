# uppercase_counter Component (`c/C31`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The uppercase character counter begins iteration at index 1 instead of index 0, missing any uppercase letter located at the start of the string.

> **Note:** Function declarations are in [`uppercase_counter.h`](uppercase_counter.h).

### Expected Behavior
Count every uppercase English letter, including the first character. For 'AbCde', the result is 2.

### Acceptance Criteria
- count_uppercase_letters / countUppercaseLetters returns 2 for 'AbCde'.
- Preserves the existing function signatures declared in `uppercase_counter.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C31
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C31
```
