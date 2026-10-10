public class SecondHighestTest {
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
        int[] a1 = {9, 9, 7, 6};
        int res1 = SecondHighest.findSecondHighest(a1);
        assertTest("testBoundaryCondition", res1 == 7, "boundary condition verification failed");

        int[] a2 = {10, 20, 30};
        int res2 = SecondHighest.findSecondHighest(a2);
        assertTest("testStandardOperation", res2 == 20, "standard operation verification failed");

        int[] a3 = {5};
        int res3 = SecondHighest.findSecondHighest(a3);
        assertTest("testIntermediateCase", res3 == -1, "intermediate case verification failed");

        int[] a4 = {15, 25};
        int res4 = SecondHighest.findSecondHighest(a4);
        assertTest("testSecondaryCase", res4 == 15, "secondary case verification failed");

        int res5 = SecondHighest.findSecondHighest(new int[0]);
        assertTest("testEdgeCase", res5 == -1, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
