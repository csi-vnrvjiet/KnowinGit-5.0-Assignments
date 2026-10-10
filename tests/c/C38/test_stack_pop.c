#include <stdio.h>
#include "stack_pop.h"

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
    pop(&s1);
    int top1 = peek(&s1);
    assert_test("test_boundary_condition", top1 == 20, "boundary condition verification failed");

    Stack s2;
    init_stack(&s2);
    push(&s2, 10);
    int top2 = peek(&s2);
    assert_test("test_standard_operation", top2 == 10, "standard operation verification failed");

    Stack s3;
    init_stack(&s3);
    assert_test("test_intermediate_case", peek(&s3) == -1, "intermediate case verification failed");

    Stack s4;
    init_stack(&s4);
    push(&s4, 10);
    push(&s4, 20);
    assert_test("test_secondary_case", peek(&s4) == 20, "secondary case verification failed");

    Stack s5;
    init_stack(&s5);
    push(&s5, 5);
    int pop5 = pop(&s5);
    assert_test("test_edge_case", pop5 == 5, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
