#include <stdio.h>
#include "trailing_word_counter.h"

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
    int res1 = count_words_trailing("one two   ");
    assert_test("test_boundary_condition", res1 == 2, "boundary condition verification failed");

    int res2 = count_words_trailing("one two");
    assert_test("test_standard_operation", res2 == 2, "standard operation verification failed");

    int res3 = count_words_trailing("hello");
    assert_test("test_intermediate_case", res3 == 1, "intermediate case verification failed");

    int res4 = count_words_trailing("a b c");
    assert_test("test_secondary_case", res4 == 3, "secondary case verification failed");

    int res5 = count_words_trailing("");
    assert_test("test_edge_case", res5 == 0, "edge case verification failed");

    printf("\nRegression Test Results: %d passed, %d failed, %d total\n", g_passed, g_failed, g_passed + g_failed);
    return (g_failed == 0) ? 0 : 1;
}
