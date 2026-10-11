# MaxIndex Component (`java/J19`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The function returns the maximum element's value instead of its array index.

> **Note:** Method declarations and signatures are in [`MaxIndex.java`](MaxIndex.java).

### Expected Behavior
Return the index of the maximum value. When multiple maximum values exist, return the first index.

### Acceptance Criteria
- find_max_index / findMaxIndex returns 1 for [10, 50, 20]. Empty array returns -1.
- Preserves the existing class structure and method signatures in `MaxIndex.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J19
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J19
```
