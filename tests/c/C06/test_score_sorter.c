#include <stdio.h>
#include "score_sorter.h"

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
    int s1[] = {5, 4, 3, 2, 1};
    sort_scores(s1, 5);
    assert_test("test_boundary_condition", s1[0] == 1 && s1[1] == 2 && s1[2] == 3 && s1[3] == 4 && s1[4] == 5, "boundary condition verification failed");

    int s2[] = {10, 20, 30};
    sort_scores(s2, 3);
    assert_test("test_standard_operation", s2[0] == 10 && s2[1] == 20 && s2[2] == 30, "standard operation verification failed");

    int s3[] = {2, 2, 2};
    sort_scores(s3, 3);
    assert_test("test_intermediate_case", s3[0] == 2 && s3[1] == 2 && s3[2] == 2, "intermediate case verification failed");

    int s4[] = {42};
    sort_scores(s4, 1);
    assert_test("test_secondary_case", s4[0] == 42, "secondary case verification failed");

    int s5[] = {1, 2};
    sort_scores(s5, 2);
    assert_test("test_edge_case", s5[0] == 1 && s5[1] == 2, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
