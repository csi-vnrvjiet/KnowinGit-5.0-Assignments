# ArrayReversal Component (`java/J13`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The in-place array reversal iterates across the entire length of the array, swapping elements twice and reverting them to original order.

> **Note:** Method declarations and signatures are in [`ArrayReversal.java`](ArrayReversal.java).

### Expected Behavior
Reverse the complete array while preserving every value. Test odd- and even-length arrays.

### Acceptance Criteria
- Reversing [1, 2, 3, 4] results in [4, 3, 2, 1].
- Preserves the existing class structure and method signatures in `ArrayReversal.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J13
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J13
```
