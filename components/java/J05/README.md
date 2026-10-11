# StudentRecords Component (`java/J05`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
Removing a student record corrupts the remaining records because the left-shift loop stops one element too early.

> **Note:** Method declarations and signatures are in [`StudentRecords.java`](StudentRecords.java).

### Expected Behavior
Removing a record must preserve the order and contents of all remaining records.

### Acceptance Criteria
- Deleting 102 from [101, 102, 103, 104] results in [101, 103, 104] and count 3.
- Preserves the existing class structure and method signatures in `StudentRecords.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J05
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J05
```
