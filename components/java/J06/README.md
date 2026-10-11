# ScoreSorter Component (`java/J06`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
Ascending bubble sort terminates the inner comparison loop one iteration too early, leaving the final elements unsorted.

> **Note:** Method declarations and signatures are in [`ScoreSorter.java`](ScoreSorter.java).

### Expected Behavior
Sorting must return values in ascending order, including the final element.

### Acceptance Criteria
- Sorting [5, 4, 3, 2, 1] produces [1, 2, 3, 4, 5].
- Preserves the existing class structure and method signatures in `ScoreSorter.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J06
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J06
```
