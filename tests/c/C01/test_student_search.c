#include <stdio.h>
#include "student_search.h"

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
    int ids[] = {101, 102, 103, 104};
    int count = 4;

    int res1 = find_student_by_id(ids, count, 104);
    assert_test("test_boundary_condition", res1 == 3, "boundary condition verification failed");

    int res2 = find_student_by_id(ids, count, 101);
    assert_test("test_standard_operation", res2 == 0, "standard operation verification failed");

    int res3 = find_student_by_id(ids, count, 102);
    assert_test("test_intermediate_case", res3 == 1, "intermediate case verification failed");

    int res4 = find_student_by_id(ids, count, 999);
    assert_test("test_secondary_case", res4 == -1, "secondary case verification failed");

    int res5 = find_student_by_id(ids, 0, 101);
    assert_test("test_edge_case", res5 == -1, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
