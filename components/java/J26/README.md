# WordCounter Component (`java/J26`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The word counter counts words as spaces + 1, incorrectly inflating word counts when multiple consecutive spaces are present.

> **Note:** Method declarations and signatures are in [`WordCounter.java`](WordCounter.java).

### Expected Behavior
Count sequences of non-whitespace characters. 'one   two' must contain two words; an empty or whitespace string must contain zero.

### Acceptance Criteria
- count_words / countWords returns 2 for 'one   two' and 0 for empty string.
- Preserves the existing class structure and method signatures in `WordCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J26
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J26
```
