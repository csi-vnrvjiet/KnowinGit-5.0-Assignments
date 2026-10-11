public class RemoveValueTest {
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
        int[] a1 = {3, 1, 3, 3, 2};
        int res1 = RemoveValue.removeAllOccurrences(a1, 5, 3);
        assertTest("testBoundaryCondition", res1 == 2 && a1[0] == 1 && a1[1] == 2, "boundary condition verification failed");

        int[] a2 = {1, 2, 4};
        int res2 = RemoveValue.removeAllOccurrences(a2, 3, 3);
        assertTest("testStandardOperation", res2 == 3 && a2[0] == 1 && a2[1] == 2 && a2[2] == 4, "standard operation verification failed");

        int[] a3 = {7, 8, 9};
        int res3 = RemoveValue.removeAllOccurrences(a3, 3, 9);
        assertTest("testIntermediateCase", res3 == 2 && a3[0] == 7 && a3[1] == 8, "intermediate case verification failed");

        int[] a4 = {5};
        int res4 = RemoveValue.removeAllOccurrences(a4, 1, 3);
        assertTest("testSecondaryCase", res4 == 1 && a4[0] == 5, "secondary case verification failed");

        int res5 = RemoveValue.removeAllOccurrences(new int[0], 0, 3);
        assertTest("testEdgeCase", res5 == 0, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
