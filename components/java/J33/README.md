# SpaceTrimmer Component (`java/J33`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The trimming helper uses single if-statements rather than loops, removing at most one leading and one trailing space.

> **Note:** Method declarations and signatures are in [`SpaceTrimmer.java`](SpaceTrimmer.java).

### Expected Behavior
Remove all leading and trailing ordinary spaces, preserving internal spaces.

### Acceptance Criteria
- trim_spaces / trimSpaces transforms '   Rahul Kumar  ' into 'Rahul Kumar'.
- Preserves the existing class structure and method signatures in `SpaceTrimmer.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J33
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J33
```
