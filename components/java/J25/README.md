# NameComparison Component (`java/J25`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The student name equality check enforces strict character case, falsely reporting that 'Rahul' and 'rAhUl' do not match.

> **Note:** Method declarations and signatures are in [`NameComparison.java`](NameComparison.java).

### Expected Behavior
'Rahul' and 'rAhUl' must match, while 'Rahu' and 'Rahul' must not match.

### Acceptance Criteria
- compare_names_case_insensitive / compareNamesCaseInsensitive returns 1 for ('Rahul', 'rAhUl') and 0 for ('Rahu', 'Rahul').
- Preserves the existing class structure and method signatures in `NameComparison.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J25
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J25
```
