# space_remover Component (`c/C30`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
When shifting characters left to delete a space, the loop does not decrement its index, skipping the second space when two spaces occur consecutively.

> **Note:** Function declarations are in [`space_remover.h`](space_remover.h).

### Expected Behavior
Removing ordinary space characters from 'a  b c' must produce 'abc'. No other characters should be removed.

### Acceptance Criteria
- remove_all_spaces / removeAllSpaces turns 'a  b c' into 'abc'.
- Preserves the existing function signatures declared in `space_remover.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C30
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C30
```
