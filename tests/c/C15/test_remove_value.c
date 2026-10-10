#include <stdio.h>
#include "remove_value.h"

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
    int a1[] = {3, 1, 3, 3, 2};
    int res1 = remove_all_occurrences(a1, 5, 3);
    assert_test("test_boundary_condition", res1 == 2 && a1[0] == 1 && a1[1] == 2, "boundary condition verification failed");

    int a2[] = {1, 2, 4};
    int res2 = remove_all_occurrences(a2, 3, 3);
    assert_test("test_standard_operation", res2 == 3 && a2[0] == 1 && a2[1] == 2 && a2[2] == 4, "standard operation verification failed");

    int a3[] = {7, 8, 9};
    int res3 = remove_all_occurrences(a3, 3, 9);
    assert_test("test_intermediate_case", res3 == 2 && a3[0] == 7 && a3[1] == 8, "intermediate case verification failed");

    int a4[] = {5};
    int res4 = remove_all_occurrences(a4, 1, 3);
    assert_test("test_secondary_case", res4 == 1 && a4[0] == 5, "secondary case verification failed");

    int res5 = remove_all_occurrences(a1, 0, 3);
    assert_test("test_edge_case", res5 == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
