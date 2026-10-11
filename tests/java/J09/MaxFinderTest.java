public class MaxFinderTest {
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
        int[] a1 = {-8, -3, -11};
        int res1 = MaxFinder.findMaximum(a1);
        assertTest("testBoundaryCondition", res1 == -3, "boundary condition verification failed");

        int[] a2 = {5, 12, 3};
        int res2 = MaxFinder.findMaximum(a2);
        assertTest("testStandardOperation", res2 == 12, "standard operation verification failed");

        int[] a3 = {-5, 7, -2};
        int res3 = MaxFinder.findMaximum(a3);
        assertTest("testIntermediateCase", res3 == 7, "intermediate case verification failed");

        int[] a4 = {10};
        int res4 = MaxFinder.findMaximum(a4);
        assertTest("testSecondaryCase", res4 == 10, "secondary case verification failed");

        int[] a5 = {-5, 0, -2};
        int res5 = MaxFinder.findMaximum(a5);
        assertTest("testEdgeCase", res5 == 0, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
