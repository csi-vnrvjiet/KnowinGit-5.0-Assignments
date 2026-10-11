# word_counter Component (`c/C26`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The word counter counts words as spaces + 1, incorrectly inflating word counts when multiple consecutive spaces are present.

> **Note:** Function declarations are in [`word_counter.h`](word_counter.h).

### Expected Behavior
Count sequences of non-whitespace characters. 'one   two' must contain two words; an empty or whitespace string must contain zero.

### Acceptance Criteria
- count_words / countWords returns 2 for 'one   two' and 0 for empty string.
- Preserves the existing function signatures declared in `word_counter.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C26
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C26
```
