#include <stdio.h>
#include "palindrome.h"

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
    int res1 = is_palindrome("abba");
    assert_test("test_boundary_condition", res1 == 1, "boundary condition verification failed");

    int res2 = is_palindrome("level");
    assert_test("test_standard_operation", res2 == 1, "standard operation verification failed");

    int res3 = is_palindrome("hello");
    assert_test("test_intermediate_case", res3 == 0, "intermediate case verification failed");

    int res4 = is_palindrome("a");
    assert_test("test_secondary_case", res4 == 1, "secondary case verification failed");

    int res5 = is_palindrome("");
    assert_test("test_edge_case", res5 == 1, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
