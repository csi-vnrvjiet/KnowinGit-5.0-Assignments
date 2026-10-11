# DigitCounter Component (`java/J23`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The digit counter loop finishes one position early, ignoring digits located at the final character position.

> **Note:** Method declarations and signatures are in [`DigitCounter.java`](DigitCounter.java).

### Expected Behavior
Count every digit, including the final character. For 'a7b2', the result is 2.

### Acceptance Criteria
- count_digits / countDigits returns 2 for 'a7b2'.
- Preserves the existing class structure and method signatures in `DigitCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J23
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J23
```
