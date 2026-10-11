# LongestName Component (`java/J35`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The search loop stops before inspecting the final name in the record array, missing the longest name when placed at the end.

> **Note:** Method declarations and signatures are in [`LongestName.java`](LongestName.java).

### Expected Behavior
Check every record, including the final one. If names tie in length, return the first matching record.

### Acceptance Criteria
- find_longest_name / findLongestName returns 'Christopher' for ['Bob', 'Alice', 'Christopher'].
- Preserves the existing class structure and method signatures in `LongestName.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J35
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J35
```
