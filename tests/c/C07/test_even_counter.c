#include <stdio.h>
#include "even_counter.h"

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
    int a1[] = {1, 3, 5, 8};
    int res1 = count_even_numbers(a1, 4);
    assert_test("test_boundary_condition", res1 == 1, "boundary condition verification failed");

    int a2[] = {2, 1, 3};
    int res2 = count_even_numbers(a2, 3);
    assert_test("test_standard_operation", res2 == 1, "standard operation verification failed");

    int a3[] = {1, 4, 3};
    int res3 = count_even_numbers(a3, 3);
    assert_test("test_intermediate_case", res3 == 1, "intermediate case verification failed");

    int a4[] = {-4, 0, 3};
    int res4 = count_even_numbers(a4, 3);
    assert_test("test_secondary_case", res4 == 2, "secondary case verification failed");

    int a5[] = {1, 3, 5};
    int res5 = count_even_numbers(a5, 3);
    assert_test("test_edge_case", res5 == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
