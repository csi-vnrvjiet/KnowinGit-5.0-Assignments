# GradeCalculator Component (`java/J02`)

Part of the **KnowinGit 5.0 Utility Library** (`core-records`).

## Component Overview
The average calculator performs integer division instead of floating-point division, truncating fractional values.

> **Note:** Method declarations and signatures are in [`GradeCalculator.java`](GradeCalculator.java).

### Expected Behavior
Averaging 80 and 81 must produce 80.5, not 80. Integer-valued averages like [70, 80, 90] must continue to produce 80.0.

### Acceptance Criteria
- calculate_average / calculateAverage returns 80.5 for [80, 81], 80.0 for [70, 80, 90], and 0.0 for empty arrays.
- Preserves the existing class structure and method signatures in `GradeCalculator.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J02
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J02
```
