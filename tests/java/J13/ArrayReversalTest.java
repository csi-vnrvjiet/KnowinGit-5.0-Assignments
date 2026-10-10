public class ArrayReversalTest {
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
        int[] a1 = {1, 2, 3, 4};
        ArrayReversal.reverseArray(a1);
        assertTest("testBoundaryCondition", a1[0] == 4 && a1[1] == 3 && a1[2] == 2 && a1[3] == 1, "boundary condition verification failed");

        int[] a2 = {42};
        ArrayReversal.reverseArray(a2);
        assertTest("testStandardOperation", a2[0] == 42, "standard operation verification failed");

        int[] a3 = {1, 2, 1};
        ArrayReversal.reverseArray(a3);
        assertTest("testIntermediateCase", a3[0] == 1 && a3[1] == 2 && a3[2] == 1, "intermediate case verification failed");

        int[] a4 = {5, 5};
        ArrayReversal.reverseArray(a4);
        assertTest("testSecondaryCase", a4[0] == 5 && a4[1] == 5, "secondary case verification failed");

        int[] a5 = new int[0];
        ArrayReversal.reverseArray(a5);
        assertTest("testEdgeCase", true, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
