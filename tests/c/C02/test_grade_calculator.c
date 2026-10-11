#include <stdio.h>
#include <math.h>
#include "grade_calculator.h"

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
    int m1[] = {80, 81};
    double res1 = calculate_average(m1, 2);
    assert_test("test_boundary_condition", fabs(res1 - 80.5) < 0.001, "boundary condition verification failed");

    int m2[] = {70, 80, 90};
    double res2 = calculate_average(m2, 3);
    assert_test("test_standard_operation", fabs(res2 - 80.0) < 0.001, "standard operation verification failed");

    int m3[] = {100};
    double res3 = calculate_average(m3, 1);
    assert_test("test_intermediate_case", fabs(res3 - 100.0) < 0.001, "intermediate case verification failed");

    int m4[] = {10, 20, 30, 40};
    double res4 = calculate_average(m4, 4);
    assert_test("test_secondary_case", fabs(res4 - 25.0) < 0.001, "secondary case verification failed");

    double res5 = calculate_average(m1, 0);
    assert_test("test_edge_case", fabs(res5 - 0.0) < 0.001, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
