public class BinarySearchTest {
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
        int[] arr = {10, 20, 30, 40, 50};

        int res1 = BinarySearch.binarySearch(arr, 10);
        assertTest("testBoundaryCondition", res1 == 0, "boundary condition verification failed");

        int res2 = BinarySearch.binarySearch(arr, 30);
        assertTest("testStandardOperation", res2 == 2, "standard operation verification failed");

        int res3 = BinarySearch.binarySearch(arr, 50);
        assertTest("testIntermediateCase", res3 == 4, "intermediate case verification failed");

        int res4 = BinarySearch.binarySearch(arr, 99);
        assertTest("testSecondaryCase", res4 == -1, "secondary case verification failed");

        int res5 = BinarySearch.binarySearch(new int[0], 10);
        assertTest("testEdgeCase", res5 == -1, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
