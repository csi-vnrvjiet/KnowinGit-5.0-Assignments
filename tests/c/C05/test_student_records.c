#include <stdio.h>
#include "student_records.h"

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
    int ids1[] = {101, 102, 103, 104};
    int count1 = 4;
    int res1 = remove_student(ids1, &count1, 102);
    assert_test("test_boundary_condition", res1 == 1 && count1 == 3 && ids1[0] == 101 && ids1[1] == 103 && ids1[2] == 104, "boundary condition verification failed");

    int ids2[] = {101, 102, 103, 104};
    int count2 = 4;
    int res2 = remove_student(ids2, &count2, 999);
    assert_test("test_standard_operation", res2 == 0 && count2 == 4, "standard operation verification failed");

    int ids3[] = {101, 102, 103, 104};
    int count3 = 4;
    int res3 = remove_student(ids3, &count3, 104);
    assert_test("test_intermediate_case", res3 == 1 && count3 == 3 && ids3[2] == 103, "intermediate case verification failed");

    int count4 = 0;
    int res4 = remove_student(ids1, &count4, 101);
    assert_test("test_secondary_case", res4 == 0 && count4 == 0, "secondary case verification failed");

    int ids5[] = {500};
    int count5 = 1;
    int res5 = remove_student(ids5, &count5, 500);
    assert_test("test_edge_case", res5 == 1 && count5 == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
