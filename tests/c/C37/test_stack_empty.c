#include <stdio.h>
#include "stack_empty.h"

static int g_passed = 0;
static int g_failed = 0;

static void assert_test(const char *name, int condition, const char *msg) {
    if (condition) {
        printf("  [PASS] %s\n", name);
        g_passed++;
    } else {
        printf("  [FAIL] %s: %s\n", name, msg);
        g_failed++;
    }
}

int main(void) {
    Stack s1;
    init_stack(&s1);
    push(&s1, 42);
    pop(&s1);
    int empty1 = is_empty(&s1);
    int peek1 = peek(&s1);
    assert_test("test_boundary_condition", empty1 == 1 && peek1 == -1, "boundary condition verification failed");

    Stack s2;
    init_stack(&s2);
    assert_test("test_standard_operation", is_empty(&s2) == 1, "standard operation verification failed");

    Stack s3;
    init_stack(&s3);
    push(&s3, 10);
    push(&s3, 20);
    pop(&s3);
    assert_test("test_intermediate_case", peek(&s3) == 10 && is_empty(&s3) == 0, "intermediate case verification failed");

    Stack s4;
    init_stack(&s4);
    assert_test("test_secondary_case", pop(&s4) == -1, "secondary case verification failed");

    Stack s5;
    init_stack(&s5);
    push(&s5, 99);
    assert_test("test_edge_case", peek(&s5) == 99, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
