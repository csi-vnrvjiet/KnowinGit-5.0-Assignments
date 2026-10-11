# stack_capacity Component (`c/C40`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The stack capacity check allows top to reach capacity before rejecting, allowing a fourth push to exceed a capacity-3 stack.

> **Note:** Function declarations are in [`stack_capacity.h`](stack_capacity.h).

### Expected Behavior
A stack with capacity 3 must accept exactly three elements, reject a fourth, and correctly accept a new element after one item has been popped.

### Acceptance Criteria
- Pushing a 4th element into capacity 3 returns 0 (false). Pushing 3 elements succeeds.
- Preserves the existing function signatures declared in `stack_capacity.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C40
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C40
```
