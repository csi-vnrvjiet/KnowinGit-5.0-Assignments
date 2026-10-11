# TrailingWordCounter Component (`java/J34`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The word counter treats trailing spaces as word separators, falsely counting an extra phantom word.

> **Note:** Method declarations and signatures are in [`TrailingWordCounter.java`](TrailingWordCounter.java).

### Expected Behavior
Trailing spaces must not create an additional word. 'one two   ' must contain two words.

### Acceptance Criteria
- count_words_trailing / countWordsTrailing returns 2 for 'one two   '.
- Preserves the existing class structure and method signatures in `TrailingWordCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J34
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J34
```
