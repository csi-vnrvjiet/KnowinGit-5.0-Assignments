# queue_order Component (`c/C39`)

Part of the **KnowinGit 5.0 Utility Library** (`core-buffers`).

## Component Overview
The dequeue method increments front by 2 instead of 1, skipping the next element in the queue.

## Module Interface
Declared in [`queue_order.h`](queue_order.h):
```c
// See queue_order.h for full declarations and type definitions
```

### Expected Behavior
Enqueue A, B, and C; dequeue A; the front must now be B. Further removals must preserve FIFO order.

### Acceptance Criteria
- peek returns 'B' after enqueuing 'A', 'B', 'C' and dequeuing once.
- Preserves the existing function signatures declared in `queue_order.h`.
- Conforms to standard C11.

## Regression Testing
Run the automated regression test suite from the repository root:

```bash
./scripts/test-component.sh c/C39
```

Or compile and run manually:
```bash
gcc -std=c11 -Wall -Wextra -pedantic -Icomponents/c/C39 components/c/C39/*.c tests/c/C39/*.c -o test_runner
./test_runner
```
