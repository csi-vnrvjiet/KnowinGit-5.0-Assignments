# StackEmpty Component (`java/J37`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The pop operation does not decrement the top pointer below 0, leaving top at 0 instead of -1 when the final element is removed.

> **Note:** Method declarations and signatures are in [`StackEmpty.java`](StackEmpty.java).

### Expected Behavior
After the only element is popped, the stack must report empty. A subsequent peek must return -1 without reading stale data.

### Acceptance Criteria
- is_empty returns 1 and peek returns -1 immediately after popping the only element.
- Preserves the existing class structure and method signatures in `StackEmpty.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J37
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J37
```
