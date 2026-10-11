public class RangeCounterTest {
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
        int[] a1 = {5, 10, 15, 20};
        int res1 = RangeCounter.countInRange(a1, 10, 20);
        assertTest("testBoundaryCondition", res1 == 3, "boundary condition verification failed");

        int[] a2 = {12, 14, 16};
        int res2 = RangeCounter.countInRange(a2, 10, 20);
        assertTest("testStandardOperation", res2 == 3, "standard operation verification failed");

        int[] a3 = {1, 2, 25};
        int res3 = RangeCounter.countInRange(a3, 10, 20);
        assertTest("testIntermediateCase", res3 == 0, "intermediate case verification failed");

        int[] a4 = {15};
        int res4 = RangeCounter.countInRange(a4, 10, 20);
        assertTest("testSecondaryCase", res4 == 1, "secondary case verification failed");

        int res5 = RangeCounter.countInRange(new int[0], 10, 20);
        assertTest("testEdgeCase", res5 == 0, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
