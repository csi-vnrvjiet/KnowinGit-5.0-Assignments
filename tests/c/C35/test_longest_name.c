#include <stdio.h>
#include <string.h>
#include "longest_name.h"

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
    const char *n1[] = {"Bob", "Alice", "Christopher"};
    const char *res1 = find_longest_name(n1, 3);
    assert_test("test_boundary_condition", strcmp(res1, "Christopher") == 0, "boundary condition verification failed");

    const char *n2[] = {"Alexander", "Bob", "Charlie"};
    const char *res2 = find_longest_name(n2, 3);
    assert_test("test_standard_operation", strcmp(res2, "Alexander") == 0, "standard operation verification failed");

    const char *n3[] = {"Al", "Jonathan", "Ed"};
    const char *res3 = find_longest_name(n3, 3);
    assert_test("test_intermediate_case", strcmp(res3, "Jonathan") == 0, "intermediate case verification failed");

    const char *n4[] = {"Anna", "Dave"};
    const char *res4 = find_longest_name(n4, 2);
    assert_test("test_secondary_case", strcmp(res4, "Anna") == 0, "secondary case verification failed");

    const char *n5[] = {"Sam"};
    const char *res5 = find_longest_name(n5, 1);
    assert_test("test_edge_case", strcmp(res5, "Sam") == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
