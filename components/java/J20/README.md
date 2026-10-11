# SecondHighest Component (`java/J20`)

Part of the **KnowinGit 5.0 Utility Library** (`core-algorithms`).

## Component Overview
When duplicates of the highest value appear, the function sets the second-highest value equal to the highest duplicate instead of finding a strictly smaller distinct value.

> **Note:** Method declarations and signatures are in [`SecondHighest.java`](SecondHighest.java).

### Expected Behavior
For [9, 9, 7, 6], return 7. If fewer than two distinct values exist, return -1.

### Acceptance Criteria
- find_second_highest / findSecondHighest returns 7 for [9, 9, 7, 6].
- Preserves the existing class structure and method signatures in `SecondHighest.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J20
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J20
```
