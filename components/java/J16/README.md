# BinarySearch Component (`java/J16`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The binary search implementation initializes low to 1 instead of 0, making it impossible to find a target stored at index 0.

> **Note:** Method declarations and signatures are in [`BinarySearch.java`](BinarySearch.java).

### Expected Behavior
Binary search must correctly find first, middle, and last elements, returning -1 for missing values.

### Acceptance Criteria
- binary_search / binarySearch returns 0 for target 10 in [10, 20, 30, 40, 50].
- Preserves the existing class structure and method signatures in `BinarySearch.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J16
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J16
```
