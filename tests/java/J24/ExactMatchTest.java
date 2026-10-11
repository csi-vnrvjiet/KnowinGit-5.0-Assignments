public class ExactMatchTest {
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
        boolean res1 = ExactMatch.isExactMatch("Ann", "Anna");
        assertTest("testBoundaryCondition", !res1, "boundary condition verification failed");

        boolean res2 = ExactMatch.isExactMatch("John", "John");
        assertTest("testStandardOperation", res2, "standard operation verification failed");

        boolean res3 = ExactMatch.isExactMatch("Alice", "Bob");
        assertTest("testIntermediateCase", !res3, "intermediate case verification failed");

        boolean res4 = ExactMatch.isExactMatch("john", "John");
        assertTest("testSecondaryCase", !res4, "secondary case verification failed");

        boolean res5 = ExactMatch.isExactMatch("", "");
        assertTest("testEdgeCase", res5, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
