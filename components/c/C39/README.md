# queue_order Component (`c/C39`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The dequeue method increments front by 2 instead of 1, skipping the next element in the queue.

> **Note:** Function declarations are in [`queue_order.h`](queue_order.h).

### Expected Behavior
Enqueue A, B, and C; dequeue A; the front must now be B. Further removals must preserve FIFO order.

### Acceptance Criteria
- peek returns 'B' after enqueuing 'A', 'B', 'C' and dequeuing once.
- Preserves the existing function signatures declared in `queue_order.h`.
- Conforms to standard C11.

## Regression Testing
Automated regression tests run automatically on GitHub Actions whenever you submit a Pull Request.

**Requirement:** All automated checks on your Pull Request must pass cleanly (green checkmark) before your contribution can be merged.

### Optional: Local Testing
You do **not** need a local compiler to contribute. However, if you already have a C compiler (GCC/Clang) installed on your machine and want to test locally before pushing, you can optionally run:

**Windows (Command Prompt or PowerShell):**
```cmd
scripts\test-component.bat C39
```

**Mac / Linux / Git Bash:**
```bash
./scripts/test-component.sh c/C39
```
