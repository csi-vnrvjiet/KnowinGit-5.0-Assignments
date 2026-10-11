# longest_name Component (`c/C35`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The search loop stops before inspecting the final name in the record array, missing the longest name when placed at the end.

> **Note:** Function declarations are in [`longest_name.h`](longest_name.h).

### Expected Behavior
Check every record, including the final one. If names tie in length, return the first matching record.

### Acceptance Criteria
- find_longest_name / findLongestName returns 'Christopher' for ['Bob', 'Alice', 'Christopher'].
- Preserves the existing function signatures declared in `longest_name.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C35
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C35
```
