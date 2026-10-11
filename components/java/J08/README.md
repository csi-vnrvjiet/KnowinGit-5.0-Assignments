# ArraySum Component (`java/J08`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The array summation routine starts iterating at index 1 instead of index 0, omitting the initial element from the calculated sum.

> **Note:** Method declarations and signatures are in [`ArraySum.java`](ArraySum.java).

### Expected Behavior
The sum must include all elements from index 0 to the final element.

### Acceptance Criteria
- Summing [-3, 2, 5] yields 4.
- Preserves the existing class structure and method signatures in `ArraySum.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J08
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J08
```
