#include <stdio.h>
#include "max_index.h"

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
    int a1[] = {10, 50, 20};
    int res1 = find_max_index(a1, 3);
    assert_test("test_boundary_condition", res1 == 1, "boundary condition verification failed");

    int a2[] = {0, -2, -5};
    int res2 = find_max_index(a2, 3);
    assert_test("test_standard_operation", res2 == 0, "standard operation verification failed");

    int a3[] = {0};
    int res3 = find_max_index(a3, 1);
    assert_test("test_intermediate_case", res3 == 0, "intermediate case verification failed");

    int a4[] = {0, -1, -3};
    int res4 = find_max_index(a4, 3);
    assert_test("test_secondary_case", res4 == 0, "secondary case verification failed");

    int res5 = find_max_index(a1, 0);
    assert_test("test_edge_case", res5 == -1, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
