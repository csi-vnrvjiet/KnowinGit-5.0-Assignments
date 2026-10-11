# ArrayListInsert Component (`java/J14`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
The insert helper rejects insertions where index == count, disallowing valid appends to the end of the list.

> **Note:** Method declarations and signatures are in [`ArrayListInsert.java`](ArrayListInsert.java).

### Expected Behavior
Inserting at the valid append position (index == count) must succeed without losing existing elements.

### Acceptance Criteria
- Inserting at index 3 in [10, 20, 30] succeeds, setting array[3] = 40 and count to 4.
- Preserves the existing class structure and method signatures in `ArrayListInsert.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J14
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J14
```
