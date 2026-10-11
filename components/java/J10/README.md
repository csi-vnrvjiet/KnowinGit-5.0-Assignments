# MinFinder Component (`java/J10`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The minimum finder initializes its candidate value to 0, causing it to return 0 instead of the lowest value in positive arrays.

> **Note:** Method declarations and signatures are in [`MinFinder.java`](MinFinder.java).

### Expected Behavior
For [8, 3, 11], the minimum must be 3. Single-element arrays must also be handled correctly.

### Acceptance Criteria
- find_minimum / findMinimum returns 3 for [8, 3, 11].
- Preserves the existing class structure and method signatures in `MinFinder.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J10
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J10
```
