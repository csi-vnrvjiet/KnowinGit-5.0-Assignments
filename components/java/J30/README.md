# SpaceRemover Component (`java/J30`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
When shifting characters left to delete a space, the loop does not decrement its index, skipping the second space when two spaces occur consecutively.

> **Note:** Method declarations and signatures are in [`SpaceRemover.java`](SpaceRemover.java).

### Expected Behavior
Removing ordinary space characters from 'a  b c' must produce 'abc'. No other characters should be removed.

### Acceptance Criteria
- remove_all_spaces / removeAllSpaces turns 'a  b c' into 'abc'.
- Preserves the existing class structure and method signatures in `SpaceRemover.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J30
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J30
```
