# BoundaryMatcher Component (`java/J32`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The function checking if a string starts and ends with the same character prematurely rejects single-character strings.

> **Note:** Method declarations and signatures are in [`BoundaryMatcher.java`](BoundaryMatcher.java).

### Expected Behavior
The helper must return true for 'a', true for 'aba', and false for 'ab'.

### Acceptance Criteria
- starts_and_ends_with_same_char / startsAndEndsWithSameChar returns 1 (true) for 'a' and 'aba', 0 (false) for 'ab'.
- Preserves the existing class structure and method signatures in `BoundaryMatcher.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J32
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J32
```
