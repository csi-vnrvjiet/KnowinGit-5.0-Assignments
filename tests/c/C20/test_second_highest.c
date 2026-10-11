#include <stdio.h>
#include "second_highest.h"

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
    int a1[] = {9, 9, 7, 6};
    int res1 = find_second_highest(a1, 4);
    assert_test("test_boundary_condition", res1 == 7, "boundary condition verification failed");

    int a2[] = {10, 20, 30};
    int res2 = find_second_highest(a2, 3);
    assert_test("test_standard_operation", res2 == 20, "standard operation verification failed");

    int a3[] = {5};
    int res3 = find_second_highest(a3, 1);
    assert_test("test_intermediate_case", res3 == -1, "intermediate case verification failed");

    int a4[] = {15, 25};
    int res4 = find_second_highest(a4, 2);
    assert_test("test_secondary_case", res4 == 15, "secondary case verification failed");

    int res5 = find_second_highest(a1, 0);
    assert_test("test_edge_case", res5 == -1, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
