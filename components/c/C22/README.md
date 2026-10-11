# vowel_counter Component (`c/C22`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The vowel counter loop stops before evaluating the final character in the string.

> **Note:** Function declarations are in [`vowel_counter.h`](vowel_counter.h).

### Expected Behavior
Count vowels case-insensitively, including a vowel at the final position. For 'area', the result is 3.

### Acceptance Criteria
- count_vowels / countVowels returns 3 for 'area'.
- Preserves the existing function signatures declared in `vowel_counter.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C22
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C22
```
