# LeftRotate Component (`java/J17`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The left rotation helper assigns array[0] (which was already overwritten) to the final index instead of the saved initial element.

> **Note:** Method declarations and signatures are in [`LeftRotate.java`](LeftRotate.java).

### Expected Behavior
Rotating [1, 2, 3, 4] left once must produce [2, 3, 4, 1]. One-element arrays must remain unchanged.

### Acceptance Criteria
- rotate_left / rotateLeft turns [1, 2, 3, 4] into [2, 3, 4, 1].
- Preserves the existing class structure and method signatures in `LeftRotate.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J17
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J17
```
