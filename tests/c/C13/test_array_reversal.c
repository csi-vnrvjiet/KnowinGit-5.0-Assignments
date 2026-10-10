#include <stdio.h>
#include "array_reversal.h"

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
    int a1[] = {1, 2, 3, 4};
    reverse_array(a1, 4);
    assert_test("test_boundary_condition", a1[0] == 4 && a1[1] == 3 && a1[2] == 2 && a1[3] == 1, "boundary condition verification failed");

    int a2[] = {42};
    reverse_array(a2, 1);
    assert_test("test_standard_operation", a2[0] == 42, "standard operation verification failed");

    int a3[] = {1, 2, 1};
    reverse_array(a3, 3);
    assert_test("test_intermediate_case", a3[0] == 1 && a3[1] == 2 && a3[2] == 1, "intermediate case verification failed");

    int a4[] = {5, 5};
    reverse_array(a4, 2);
    assert_test("test_secondary_case", a4[0] == 5 && a4[1] == 5, "secondary case verification failed");

    int count0 = 0;
    reverse_array(a1, count0);
    assert_test("test_edge_case", 1, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
