# RemoveValue Component (`java/J15`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The element removal algorithm erroneously increments its iteration pointer when a target is found, skipping examination of adjacent elements.

> **Note:** Method declarations and signatures are in [`RemoveValue.java`](RemoveValue.java).

### Expected Behavior
Removing 3 from [3, 1, 3, 3, 2] must produce [1, 2] with a count of 2.

### Acceptance Criteria
- remove_all_occurrences / removeAllOccurrences produces [1, 2] and count 2 for input [3, 1, 3, 3, 2].
- Preserves the existing class structure and method signatures in `RemoveValue.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J15
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J15
```
