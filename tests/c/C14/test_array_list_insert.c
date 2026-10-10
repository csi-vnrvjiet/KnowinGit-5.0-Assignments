#include <stdio.h>
#include "array_list_insert.h"

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
    int arr1[10] = {10, 20, 30};
    int count1 = 3;
    int res1 = insert_at_index(arr1, &count1, 10, 3, 40);
    assert_test("test_boundary_condition", res1 == 1 && count1 == 4 && arr1[3] == 40 && arr1[0] == 10, "boundary condition verification failed");

    int arr2[10] = {10, 20};
    int count2 = 2;
    int res2 = insert_at_index(arr2, &count2, 10, 0, 5);
    assert_test("test_standard_operation", res2 == 1 && count2 == 3 && arr2[0] == 5 && arr2[1] == 10 && arr2[2] == 20, "standard operation verification failed");

    int arr3[10] = {10, 30};
    int count3 = 2;
    int res3 = insert_at_index(arr3, &count3, 10, 1, 20);
    assert_test("test_intermediate_case", res3 == 1 && count3 == 3 && arr3[1] == 20, "intermediate case verification failed");

    int count4 = 3;
    int res4 = insert_at_index(arr1, &count4, 10, -1, 99);
    assert_test("test_secondary_case", res4 == 0 && count4 == 3, "secondary case verification failed");

    int count5 = 3;
    int res5 = insert_at_index(arr1, &count5, 10, 99, 99);
    assert_test("test_edge_case", res5 == 0 && count5 == 3, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
