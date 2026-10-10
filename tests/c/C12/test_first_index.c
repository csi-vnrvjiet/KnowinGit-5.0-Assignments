#include <stdio.h>
#include "first_index.h"

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
    int a1[] = {4, 7, 4};
    int res1 = find_first_index(a1, 3, 4);
    assert_test("test_boundary_condition", res1 == 0, "boundary condition verification failed");

    int a2[] = {10, 20, 30};
    int res2 = find_first_index(a2, 3, 20);
    assert_test("test_standard_operation", res2 == 1, "standard operation verification failed");

    int a3[] = {10, 20, 30};
    int res3 = find_first_index(a3, 3, 30);
    assert_test("test_intermediate_case", res3 == 2, "intermediate case verification failed");

    int a4[] = {1, 2, 3};
    int res4 = find_first_index(a4, 3, 99);
    assert_test("test_secondary_case", res4 == -1, "secondary case verification failed");

    int res5 = find_first_index(a1, 0, 4);
    assert_test("test_edge_case", res5 == -1, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
