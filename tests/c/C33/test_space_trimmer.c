#include <stdio.h>
#include <string.h>
#include "space_trimmer.h"

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
    char out1[50];
    trim_spaces("   Rahul Kumar  ", out1);
    assert_test("test_boundary_condition", strcmp(out1, "Rahul Kumar") == 0, "boundary condition verification failed");

    char out2[50];
    trim_spaces("John Doe", out2);
    assert_test("test_standard_operation", strcmp(out2, "John Doe") == 0, "standard operation verification failed");

    char out3[50];
    trim_spaces(" Alice ", out3);
    assert_test("test_intermediate_case", strcmp(out3, "Alice") == 0, "intermediate case verification failed");

    char out4[50];
    trim_spaces("", out4);
    assert_test("test_secondary_case", strcmp(out4, "") == 0, "secondary case verification failed");

    char out5[50];
    trim_spaces("A", out5);
    assert_test("test_edge_case", strcmp(out5, "A") == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
