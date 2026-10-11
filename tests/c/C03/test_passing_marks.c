#include <stdio.h>
#include "passing_marks.h"

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
    int m1[] = {39, 40, 41};
    int res1 = count_passing_students(m1, 3, 40);
    assert_test("test_boundary_condition", res1 == 2, "boundary condition verification failed");

    int m2[] = {50, 60, 70};
    int res2 = count_passing_students(m2, 3, 40);
    assert_test("test_standard_operation", res2 == 3, "standard operation verification failed");

    int m3[] = {10, 20, 35};
    int res3 = count_passing_students(m3, 3, 40);
    assert_test("test_intermediate_case", res3 == 0, "intermediate case verification failed");

    int m4[] = {45};
    int res4 = count_passing_students(m4, 1, 40);
    assert_test("test_secondary_case", res4 == 1, "secondary case verification failed");

    int res5 = count_passing_students(m1, 0, 40);
    assert_test("test_edge_case", res5 == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
