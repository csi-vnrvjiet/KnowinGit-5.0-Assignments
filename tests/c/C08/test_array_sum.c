#include <stdio.h>
#include "array_sum.h"

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
    int v1[] = {-3, 2, 5};
    int res1 = sum_array(v1, 3);
    assert_test("test_boundary_condition", res1 == 4, "boundary condition verification failed");

    int v2[] = {0, 5, 10};
    int res2 = sum_array(v2, 3);
    assert_test("test_standard_operation", res2 == 15, "standard operation verification failed");

    int v3[] = {0, 10};
    int res3 = sum_array(v3, 2);
    assert_test("test_intermediate_case", res3 == 10, "intermediate case verification failed");

    int v4[] = {0, -5, 5};
    int res4 = sum_array(v4, 3);
    assert_test("test_secondary_case", res4 == 0, "secondary case verification failed");

    int res5 = sum_array(v1, 0);
    assert_test("test_edge_case", res5 == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
