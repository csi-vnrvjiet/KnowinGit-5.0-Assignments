# StudentRegistry Component (`java/J04`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The registration function checks for duplicates before adding an ID, but its validation loop stops before checking the final existing record.

> **Note:** Method declarations and signatures are in [`StudentRegistry.java`](StudentRegistry.java).

### Expected Behavior
Registration must reject an ID already present, including when the matching ID is the final existing record. Existing records must remain unchanged.

### Acceptance Criteria
- Registering 103 when [101, 102, 103] exists returns 0 (false) and keeps count at 3.
- Preserves the existing class structure and method signatures in `StudentRegistry.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J04
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J04
```
