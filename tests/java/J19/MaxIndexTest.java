public class MaxIndexTest {
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
        int[] a1 = {10, 50, 20};
        int res1 = MaxIndex.findMaxIndex(a1);
        assertTest("testBoundaryCondition", res1 == 1, "boundary condition verification failed");

        int[] a2 = {0, -2, -5};
        int res2 = MaxIndex.findMaxIndex(a2);
        assertTest("testStandardOperation", res2 == 0, "standard operation verification failed");

        int[] a3 = {0};
        int res3 = MaxIndex.findMaxIndex(a3);
        assertTest("testIntermediateCase", res3 == 0, "intermediate case verification failed");

        int[] a4 = {0, -1, -3};
        int res4 = MaxIndex.findMaxIndex(a4);
        assertTest("testSecondaryCase", res4 == 0, "secondary case verification failed");

        int res5 = MaxIndex.findMaxIndex(new int[0]);
        assertTest("testEdgeCase", res5 == -1, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
