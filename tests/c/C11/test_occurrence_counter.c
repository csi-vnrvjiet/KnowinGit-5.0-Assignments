#include <stdio.h>
#include "occurrence_counter.h"

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
    int a1[] = {2, 3, 5, 2};
    int res1 = count_occurrences(a1, 4, 2);
    assert_test("test_boundary_condition", res1 == 2, "boundary condition verification failed");

    int a2[] = {1, 7, 3};
    int res2 = count_occurrences(a2, 3, 7);
    assert_test("test_standard_operation", res2 == 1, "standard operation verification failed");

    int a3[] = {9, 1, 2};
    int res3 = count_occurrences(a3, 3, 9);
    assert_test("test_intermediate_case", res3 == 1, "intermediate case verification failed");

    int a4[] = {1, 2, 3};
    int res4 = count_occurrences(a4, 3, 99);
    assert_test("test_secondary_case", res4 == 0, "secondary case verification failed");

    int res5 = count_occurrences(a1, 0, 2);
    assert_test("test_edge_case", res5 == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
