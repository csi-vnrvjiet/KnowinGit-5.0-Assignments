# CharReplace Component (`java/J29`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The replacement routine breaks out of its traversal loop after modifying the first matching character, leaving subsequent occurrences untouched.

> **Note:** Method declarations and signatures are in [`CharReplace.java`](CharReplace.java).

### Expected Behavior
Replacing 'a' with 'o' in 'banana' must produce 'bonono'. All matching occurrences must be replaced.

### Acceptance Criteria
- replace_all_chars / replaceAllChars turns 'banana' into 'bonono'.
- Preserves the existing class structure and method signatures in `CharReplace.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J29
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J29
```
