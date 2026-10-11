# boundary_matcher Component (`c/C32`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The function checking if a string starts and ends with the same character prematurely rejects single-character strings.

> **Note:** Function declarations are in [`boundary_matcher.h`](boundary_matcher.h).

### Expected Behavior
The helper must return true for 'a', true for 'aba', and false for 'ab'.

### Acceptance Criteria
- starts_and_ends_with_same_char / startsAndEndsWithSameChar returns 1 (true) for 'a' and 'aba', 0 (false) for 'ab'.
- Preserves the existing function signatures declared in `boundary_matcher.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C32
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C32
```
