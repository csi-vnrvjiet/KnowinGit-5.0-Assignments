#include <stdio.h>
#include <string.h>
#include "string_reversal.h"

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
    char s1[] = "college";
    reverse_string(s1);
    assert_test("test_boundary_condition", strcmp(s1, "egelloc") == 0, "boundary condition verification failed");

    char s2[] = "madam";
    reverse_string(s2);
    assert_test("test_standard_operation", strcmp(s2, "madam") == 0, "standard operation verification failed");

    char s3[] = "a";
    reverse_string(s3);
    assert_test("test_intermediate_case", strcmp(s3, "a") == 0, "intermediate case verification failed");

    char s4[] = "";
    reverse_string(s4);
    assert_test("test_secondary_case", strcmp(s4, "") == 0, "secondary case verification failed");

    char s5[] = "oo";
    reverse_string(s5);
    assert_test("test_edge_case", strcmp(s5, "oo") == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
