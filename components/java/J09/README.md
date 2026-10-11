# MaxFinder Component (`java/J09`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The maximum finder initializes its candidate value to 0, causing it to return 0 when all array elements are negative.

> **Note:** Method declarations and signatures are in [`MaxFinder.java`](MaxFinder.java).

### Expected Behavior
For [-8, -3, -11], the maximum must be -3. Single-element and mixed arrays must also return the correct maximum.

### Acceptance Criteria
- find_maximum / findMaximum returns -3 for [-8, -3, -11].
- Preserves the existing class structure and method signatures in `MaxFinder.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J09
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J09
```
