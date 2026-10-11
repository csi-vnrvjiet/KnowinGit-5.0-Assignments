# UppercaseCounter Component (`java/J31`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The uppercase character counter begins iteration at index 1 instead of index 0, missing any uppercase letter located at the start of the string.

> **Note:** Method declarations and signatures are in [`UppercaseCounter.java`](UppercaseCounter.java).

### Expected Behavior
Count every uppercase English letter, including the first character. For 'AbCde', the result is 2.

### Acceptance Criteria
- count_uppercase_letters / countUppercaseLetters returns 2 for 'AbCde'.
- Preserves the existing class structure and method signatures in `UppercaseCounter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J31
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J31
```
