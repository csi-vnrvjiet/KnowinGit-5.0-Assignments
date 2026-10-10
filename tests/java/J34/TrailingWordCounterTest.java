public class TrailingWordCounterTest {
    private static int passed = 0;
    private static int failed = 0;

    private static void assertTest(String name, boolean condition, String msg) {
        if (condition) {
            System.out.println("  [PASS] " + name);
            passed++;
        } else {
            System.out.println("  [FAIL] " + name + ": " + msg);
            failed++;
        }
    }

    public static void main(String[] args) {
        int res1 = TrailingWordCounter.countWordsTrailing("one two   ");
        assertTest("testBoundaryCondition", res1 == 2, "boundary condition verification failed");

        int res2 = TrailingWordCounter.countWordsTrailing("one two");
        assertTest("testStandardOperation", res2 == 2, "standard operation verification failed");

        int res3 = TrailingWordCounter.countWordsTrailing("hello");
        assertTest("testIntermediateCase", res3 == 1, "intermediate case verification failed");

        int res4 = TrailingWordCounter.countWordsTrailing("a b c");
        assertTest("testSecondaryCase", res4 == 3, "secondary case verification failed");

        int res5 = TrailingWordCounter.countWordsTrailing("");
        assertTest("testEdgeCase", res5 == 0, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
