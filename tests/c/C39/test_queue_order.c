#include <stdio.h>
#include "queue_order.h"

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
    Queue q1;
    init_queue(&q1);
    enqueue(&q1, 'A');
    enqueue(&q1, 'B');
    enqueue(&q1, 'C');
    dequeue(&q1);
    char front1 = peek_queue(&q1);
    assert_test("test_boundary_condition", front1 == 'B', "boundary condition verification failed");

    Queue q2;
    init_queue(&q2);
    enqueue(&q2, 'X');
    char front2 = peek_queue(&q2);
    assert_test("test_standard_operation", front2 == 'X', "standard operation verification failed");

    Queue q3;
    init_queue(&q3);
    char front3 = peek_queue(&q3);
    assert_test("test_intermediate_case", front3 == '\0', "intermediate case verification failed");

    Queue q4;
    init_queue(&q4);
    enqueue(&q4, 'A');
    enqueue(&q4, 'B');
    char front4 = peek_queue(&q4);
    assert_test("test_secondary_case", front4 == 'A', "secondary case verification failed");

    Queue q5;
    init_queue(&q5);
    char deq5 = dequeue(&q5);
    assert_test("test_edge_case", deq5 == '\0', "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
