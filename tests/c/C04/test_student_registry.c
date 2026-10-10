#include <stdio.h>
#include "student_registry.h"

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
    int ids1[10] = {101, 102, 103};
    int count1 = 3;
    int res1 = register_student(ids1, &count1, 10, 103);
    assert_test("test_boundary_condition", res1 == 0, "boundary condition verification failed");

    int ids2[10] = {101, 102, 103};
    int count2 = 3;
    int res2 = register_student(ids2, &count2, 10, 101);
    assert_test("test_standard_operation", res2 == 0 && count2 == 3, "standard operation verification failed");

    int ids3[10] = {101, 102, 103};
    int count3 = 3;
    int res3 = register_student(ids3, &count3, 10, 102);
    assert_test("test_intermediate_case", res3 == 0 && count3 == 3, "intermediate case verification failed");

    int ids4[10] = {101, 102, 103};
    int count4 = 3;
    int res4 = register_student(ids4, &count4, 10, 104);
    assert_test("test_secondary_case", res4 == 1 && count4 == 4 && ids4[3] == 104, "secondary case verification failed");

    int ids_empty[5];
    int empty_count = 0;
    int res5 = register_student(ids_empty, &empty_count, 5, 201);
    assert_test("test_edge_case", res5 == 1 && empty_count == 1 && ids_empty[0] == 201, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
