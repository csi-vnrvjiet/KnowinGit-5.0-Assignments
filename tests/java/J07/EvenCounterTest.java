public class EvenCounterTest {
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
        int[] a1 = {1, 3, 5, 8};
        int res1 = EvenCounter.countEvenNumbers(a1);
        assertTest("testBoundaryCondition", res1 == 1, "boundary condition verification failed");

        int[] a2 = {2, 1, 3};
        int res2 = EvenCounter.countEvenNumbers(a2);
        assertTest("testStandardOperation", res2 == 1, "standard operation verification failed");

        int[] a3 = {1, 4, 3};
        int res3 = EvenCounter.countEvenNumbers(a3);
        assertTest("testIntermediateCase", res3 == 1, "intermediate case verification failed");

        int[] a4 = {-4, 0, 3};
        int res4 = EvenCounter.countEvenNumbers(a4);
        assertTest("testSecondaryCase", res4 == 2, "secondary case verification failed");

        int[] a5 = {1, 3, 5};
        int res5 = EvenCounter.countEvenNumbers(a5);
        assertTest("testEdgeCase", res5 == 0, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
