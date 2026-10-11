# stack_pop Component (`c/C38`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The pop operation decrements top by 2 instead of 1, corrupting the stack pointer and skipping the expected predecessor element.

> **Note:** Function declarations are in [`stack_pop.h`](stack_pop.h).

### Expected Behavior
After pushing 10, 20 and 30, then popping once, peek must return 20. Preserve LIFO behavior.

### Acceptance Criteria
- peek returns 20 after pushing [10, 20, 30] and popping once.
- Preserves the existing function signatures declared in `stack_pop.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C38
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C38
```
