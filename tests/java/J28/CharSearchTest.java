public class CharSearchTest {
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
        int res1 = CharSearch.findCharIndex("apple", 'a');
        assertTest("testBoundaryCondition", res1 == 0, "boundary condition verification failed");

        int res2 = CharSearch.findCharIndex("cat", 'a');
        assertTest("testStandardOperation", res2 == 1, "standard operation verification failed");

        int res3 = CharSearch.findCharIndex("dog", 'g');
        assertTest("testIntermediateCase", res3 == 2, "intermediate case verification failed");

        int res4 = CharSearch.findCharIndex("hello", 'z');
        assertTest("testSecondaryCase", res4 == -1, "secondary case verification failed");

        int res5 = CharSearch.findCharIndex("", 'x');
        assertTest("testEdgeCase", res5 == -1, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
