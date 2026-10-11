#include <stdio.h>
#include <string.h>
#include "char_replace.h"

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
    char s1[] = "banana";
    replace_all_chars(s1, 'a', 'o');
    assert_test("test_boundary_condition", strcmp(s1, "bonono") == 0, "boundary condition verification failed");

    char s2[] = "cat";
    replace_all_chars(s2, 'a', 'o');
    assert_test("test_standard_operation", strcmp(s2, "cot") == 0, "standard operation verification failed");

    char s3[] = "dog";
    replace_all_chars(s3, 'x', 'y');
    assert_test("test_intermediate_case", strcmp(s3, "dog") == 0, "intermediate case verification failed");

    char s4[] = "";
    replace_all_chars(s4, 'a', 'b');
    assert_test("test_secondary_case", strcmp(s4, "") == 0, "secondary case verification failed");

    char s5[] = "ant";
    replace_all_chars(s5, 'a', 'u');
    assert_test("test_edge_case", strcmp(s5, "unt") == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
