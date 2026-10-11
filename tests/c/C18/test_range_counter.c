#include <stdio.h>
#include "range_counter.h"

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
    int a1[] = {5, 10, 15, 20};
    int res1 = count_in_range(a1, 4, 10, 20);
    assert_test("test_boundary_condition", res1 == 3, "boundary condition verification failed");

    int a2[] = {12, 14, 16};
    int res2 = count_in_range(a2, 3, 10, 20);
    assert_test("test_standard_operation", res2 == 3, "standard operation verification failed");

    int a3[] = {1, 2, 25};
    int res3 = count_in_range(a3, 3, 10, 20);
    assert_test("test_intermediate_case", res3 == 0, "intermediate case verification failed");

    int a4[] = {15};
    int res4 = count_in_range(a4, 1, 10, 20);
    assert_test("test_secondary_case", res4 == 1, "secondary case verification failed");

    int res5 = count_in_range(a1, 0, 10, 20);
    assert_test("test_edge_case", res5 == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
