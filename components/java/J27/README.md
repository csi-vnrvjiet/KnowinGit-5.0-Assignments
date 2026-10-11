# StringReversal Component (`java/J27`)

Part of the **KnowinGit 5.0 Utility Library** (`core-strings`).

## Component Overview
The string reversal algorithm runs its swap loop across all characters up to len, reversing characters twice and restoring original order.

> **Note:** Method declarations and signatures are in [`StringReversal.java`](StringReversal.java).

### Expected Behavior
Reverse the entire string. 'college' must produce 'egelloc'. Empty and one-character strings must also behave correctly.

### Acceptance Criteria
- reverse_string / reverseString transforms 'college' into 'egelloc'.
- Preserves the existing class structure and method signatures in `StringReversal.java`.
- Conforms to standard Java 17+.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a JDK installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat J27
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh java/J27
```
