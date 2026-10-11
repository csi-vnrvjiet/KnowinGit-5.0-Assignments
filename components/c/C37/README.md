# stack_empty Component (`c/C37`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The pop operation does not decrement the top pointer below 0, leaving top at 0 instead of -1 when the final element is removed.

> **Note:** Function declarations are in [`stack_empty.h`](stack_empty.h).

### Expected Behavior
After the only element is popped, the stack must report empty. A subsequent peek must return -1 without reading stale data.

### Acceptance Criteria
- is_empty returns 1 and peek returns -1 immediately after popping the only element.
- Preserves the existing function signatures declared in `stack_empty.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C37
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C37
```
