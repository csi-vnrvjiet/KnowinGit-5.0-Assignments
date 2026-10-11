# CharSearch Component (`java/J28`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The character search loop starts indexing at 1 instead of 0, failing to match any character located at the start of the string.

> **Note:** Method declarations and signatures are in [`CharSearch.java`](CharSearch.java).

### Expected Behavior
Character search must find a matching character at the first position and return -1 when absent.

### Acceptance Criteria
- find_char_index / findCharIndex returns 0 for 'a' in 'apple'.
- Preserves the existing class structure and method signatures in `CharSearch.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J28
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J28
```
