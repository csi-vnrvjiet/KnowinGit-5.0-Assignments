# occurrence_counter Component (`c/C11`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The occurrence counter stops scanning before inspecting the element at the final index.

> **Note:** Function declarations are in [`occurrence_counter.h`](occurrence_counter.h).

### Expected Behavior
Count every occurrence of the requested value, including occurrences at the final index.

### Acceptance Criteria
- Counting 2 in [2, 3, 5, 2] returns 2. Absent values return 0.
- Preserves the existing function signatures declared in `occurrence_counter.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C11
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C11
```
