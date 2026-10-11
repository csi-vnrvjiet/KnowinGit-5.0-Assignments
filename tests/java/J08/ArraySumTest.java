public class ArraySumTest {
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
        int[] v1 = {-3, 2, 5};
        int res1 = ArraySum.sumArray(v1);
        assertTest("testBoundaryCondition", res1 == 4, "boundary condition verification failed");

        int[] v2 = {0, 5, 10};
        int res2 = ArraySum.sumArray(v2);
        assertTest("testStandardOperation", res2 == 15, "standard operation verification failed");

        int[] v3 = {0, 10};
        int res3 = ArraySum.sumArray(v3);
        assertTest("testIntermediateCase", res3 == 10, "intermediate case verification failed");

        int[] v4 = {0, -5, 5};
        int res4 = ArraySum.sumArray(v4);
        assertTest("testSecondaryCase", res4 == 0, "secondary case verification failed");

        int res5 = ArraySum.sumArray(new int[0]);
        assertTest("testEdgeCase", res5 == 0, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
