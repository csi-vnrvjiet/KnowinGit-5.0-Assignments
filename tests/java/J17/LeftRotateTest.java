public class LeftRotateTest {
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
        LeftRotate.rotateLeft(a1);
        assertTest("testBoundaryCondition", a1[0] == 2 && a1[1] == 3 && a1[2] == 4 && a1[3] == 1, "boundary condition verification failed");

        int[] a2 = {10};
        LeftRotate.rotateLeft(a2);
        assertTest("testStandardOperation", a2[0] == 10, "standard operation verification failed");

        int[] a3 = {5, 5, 5};
        LeftRotate.rotateLeft(a3);
        assertTest("testIntermediateCase", a3[0] == 5 && a3[1] == 5 && a3[2] == 5, "intermediate case verification failed");

        int[] a4 = {7, 7};
        LeftRotate.rotateLeft(a4);
        assertTest("testSecondaryCase", a4[0] == 7 && a4[1] == 7, "secondary case verification failed");

        LeftRotate.rotateLeft(new int[0]);
        assertTest("testEdgeCase", true, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
