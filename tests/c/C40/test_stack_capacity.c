#include <stdio.h>
#include "stack_capacity.h"

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
    push(&s1, 10);
    push(&s1, 20);
    push(&s1, 30);
    int res1 = push(&s1, 40);
    assert_test("test_boundary_condition", res1 == 0, "boundary condition verification failed");

    Stack s2;
    init_stack(&s2);
    int res2 = push(&s2, 10);
    assert_test("test_standard_operation", res2 == 1, "standard operation verification failed");

    Stack s3;
    init_stack(&s3);
    push(&s3, 10);
    int res3 = push(&s3, 20);
    assert_test("test_intermediate_case", res3 == 1, "intermediate case verification failed");

    Stack s4;
    init_stack(&s4);
    assert_test("test_secondary_case", peek(&s4) == -1, "secondary case verification failed");

    Stack s5;
    init_stack(&s5);
    push(&s5, 99);
    int pop5 = pop(&s5);
    assert_test("test_edge_case", pop5 == 99, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
