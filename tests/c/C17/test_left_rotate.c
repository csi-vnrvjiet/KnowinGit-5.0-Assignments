#include <stdio.h>
#include "left_rotate.h"

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
    rotate_left(a1, 4);
    assert_test("test_boundary_condition", a1[0] == 2 && a1[1] == 3 && a1[2] == 4 && a1[3] == 1, "boundary condition verification failed");

    int a2[] = {10};
    rotate_left(a2, 1);
    assert_test("test_standard_operation", a2[0] == 10, "standard operation verification failed");

    int a3[] = {5, 5, 5};
    rotate_left(a3, 3);
    assert_test("test_intermediate_case", a3[0] == 5 && a3[1] == 5 && a3[2] == 5, "intermediate case verification failed");

    int a4[] = {7, 7};
    rotate_left(a4, 2);
    assert_test("test_secondary_case", a4[0] == 7 && a4[1] == 7, "secondary case verification failed");

    rotate_left(a1, 0);
    assert_test("test_edge_case", 1, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
