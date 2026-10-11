# exact_match Component (`c/C24`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The comparison function performs a prefix match instead of an exact full match, mistakenly treating 'Ann' as matching 'Anna'.

> **Note:** Function declarations are in [`exact_match.h`](exact_match.h).

### Expected Behavior
'Ann' must not match 'Anna'. Identical strings must match. Case-sensitive.

### Acceptance Criteria
- is_exact_match / isExactMatch returns 0 for ('Ann', 'Anna') and 1 for ('John', 'John').
- Preserves the existing function signatures declared in `exact_match.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C24
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C24
```
