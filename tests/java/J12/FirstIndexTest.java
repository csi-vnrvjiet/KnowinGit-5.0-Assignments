public class FirstIndexTest {
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
        int[] a1 = {4, 7, 4};
        int res1 = FirstIndex.findFirstIndex(a1, 4);
        assertTest("testBoundaryCondition", res1 == 0, "boundary condition verification failed");

        int[] a2 = {10, 20, 30};
        int res2 = FirstIndex.findFirstIndex(a2, 20);
        assertTest("testStandardOperation", res2 == 1, "standard operation verification failed");

        int[] a3 = {10, 20, 30};
        int res3 = FirstIndex.findFirstIndex(a3, 30);
        assertTest("testIntermediateCase", res3 == 2, "intermediate case verification failed");

        int[] a4 = {1, 2, 3};
        int res4 = FirstIndex.findFirstIndex(a4, 99);
        assertTest("testSecondaryCase", res4 == -1, "secondary case verification failed");

        int res5 = FirstIndex.findFirstIndex(new int[0], 4);
        assertTest("testEdgeCase", res5 == -1, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
