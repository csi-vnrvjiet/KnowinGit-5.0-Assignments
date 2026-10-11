#include <stdio.h>
#include "max_finder.h"

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
    int a1[] = {-8, -3, -11};
    int res1 = find_maximum(a1, 3);
    assert_test("test_boundary_condition", res1 == -3, "boundary condition verification failed");

    int a2[] = {5, 12, 3};
    int res2 = find_maximum(a2, 3);
    assert_test("test_standard_operation", res2 == 12, "standard operation verification failed");

    int a3[] = {-5, 7, -2};
    int res3 = find_maximum(a3, 3);
    assert_test("test_intermediate_case", res3 == 7, "intermediate case verification failed");

    int a4[] = {10};
    int res4 = find_maximum(a4, 1);
    assert_test("test_secondary_case", res4 == 10, "secondary case verification failed");

    int a5[] = {-5, 0, -2};
    int res5 = find_maximum(a5, 3);
    assert_test("test_edge_case", res5 == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
