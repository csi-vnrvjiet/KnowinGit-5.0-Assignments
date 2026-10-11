# remove_value Component (`c/C15`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The element removal algorithm erroneously increments its iteration pointer when a target is found, skipping examination of adjacent elements.

> **Note:** Function declarations are in [`remove_value.h`](remove_value.h).

### Expected Behavior
Removing 3 from [3, 1, 3, 3, 2] must produce [1, 2] with a count of 2.

### Acceptance Criteria
- remove_all_occurrences / removeAllOccurrences produces [1, 2] and count 2 for input [3, 1, 3, 3, 2].
- Preserves the existing function signatures declared in `remove_value.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C15
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C15
```
