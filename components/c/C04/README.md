# student_registry Component (`c/C04`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The registration function checks for duplicates before adding an ID, but its validation loop stops before checking the final existing record.

> **Note:** Function declarations are in [`student_registry.h`](student_registry.h).

### Expected Behavior
Registration must reject an ID already present, including when the matching ID is the final existing record. Existing records must remain unchanged.

### Acceptance Criteria
- Registering 103 when [101, 102, 103] exists returns 0 (false) and keeps count at 3.
- Preserves the existing function signatures declared in `student_registry.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C04
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C04
```
