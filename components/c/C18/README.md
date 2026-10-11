# range_counter Component (`c/C18`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The range filter uses strict inequalities (> and <) rather than inclusive checks (>= and <=), ignoring boundary values.

> **Note:** Function declarations are in [`range_counter.h`](range_counter.h).

### Expected Behavior
Counting values within an inclusive range must include elements equal to the lower or upper bound.

### Acceptance Criteria
- count_in_range / countInRange returns 3 for [5, 10, 15, 20] with range [10, 20].
- Preserves the existing function signatures declared in `range_counter.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C18
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C18
```
