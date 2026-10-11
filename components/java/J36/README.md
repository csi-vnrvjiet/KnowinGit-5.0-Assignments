# LetterCounter Component (`java/J36`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The function counts any non-space character, erroneously including digits and punctuation symbols in the letter count.

> **Note:** Method declarations and signatures are in [`LetterCounter.java`](LetterCounter.java).

### Expected Behavior
Count English alphabetic characters while ignoring digits, spaces, and punctuation. For 'A1 b!', return 2.

### Acceptance Criteria
- count_letters_only / countLettersOnly returns 2 for 'A1 b!'.
- Preserves the existing class structure and method signatures in `LetterCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J36
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J36
```
