public class MinFinderTest {
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
        int[] a1 = {8, 3, 11};
        int res1 = MinFinder.findMinimum(a1);
        assertTest("testBoundaryCondition", res1 == 3, "boundary condition verification failed");

        int[] a2 = {-5, 2, 8};
        int res2 = MinFinder.findMinimum(a2);
        assertTest("testStandardOperation", res2 == -5, "standard operation verification failed");

        int[] a3 = {-10};
        int res3 = MinFinder.findMinimum(a3);
        assertTest("testIntermediateCase", res3 == -10, "intermediate case verification failed");

        int[] a4 = {0, 5, 8};
        int res4 = MinFinder.findMinimum(a4);
        assertTest("testSecondaryCase", res4 == 0, "secondary case verification failed");

        int[] a5 = {-2, -8, -4};
        int res5 = MinFinder.findMinimum(a5);
        assertTest("testEdgeCase", res5 == -8, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
