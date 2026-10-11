public class OccurrenceCounterTest {
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
        int[] a1 = {2, 3, 5, 2};
        int res1 = OccurrenceCounter.countOccurrences(a1, 2);
        assertTest("testBoundaryCondition", res1 == 2, "boundary condition verification failed");

        int[] a2 = {1, 7, 3};
        int res2 = OccurrenceCounter.countOccurrences(a2, 7);
        assertTest("testStandardOperation", res2 == 1, "standard operation verification failed");

        int[] a3 = {9, 1, 2};
        int res3 = OccurrenceCounter.countOccurrences(a3, 9);
        assertTest("testIntermediateCase", res3 == 1, "intermediate case verification failed");

        int[] a4 = {1, 2, 3};
        int res4 = OccurrenceCounter.countOccurrences(a4, 99);
        assertTest("testSecondaryCase", res4 == 0, "secondary case verification failed");

        int res5 = OccurrenceCounter.countOccurrences(new int[0], 2);
        assertTest("testEdgeCase", res5 == 0, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
