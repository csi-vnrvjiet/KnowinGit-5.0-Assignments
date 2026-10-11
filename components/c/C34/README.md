# trailing_word_counter Component (`c/C34`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The word counter treats trailing spaces as word separators, falsely counting an extra phantom word.

> **Note:** Function declarations are in [`trailing_word_counter.h`](trailing_word_counter.h).

### Expected Behavior
Trailing spaces must not create an additional word. 'one two   ' must contain two words.

### Acceptance Criteria
- count_words_trailing / countWordsTrailing returns 2 for 'one two   '.
- Preserves the existing function signatures declared in `trailing_word_counter.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C34
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C34
```
