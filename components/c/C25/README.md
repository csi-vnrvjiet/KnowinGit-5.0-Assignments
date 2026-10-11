# name_comparison Component (`c/C25`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The student name equality check enforces strict character case, falsely reporting that 'Rahul' and 'rAhUl' do not match.

> **Note:** Function declarations are in [`name_comparison.h`](name_comparison.h).

### Expected Behavior
'Rahul' and 'rAhUl' must match, while 'Rahu' and 'Rahul' must not match.

### Acceptance Criteria
- compare_names_case_insensitive / compareNamesCaseInsensitive returns 1 for ('Rahul', 'rAhUl') and 0 for ('Rahu', 'Rahul').
- Preserves the existing function signatures declared in `name_comparison.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C25
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C25
```
