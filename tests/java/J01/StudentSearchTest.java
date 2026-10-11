public class StudentSearchTest {
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
        int[] ids = {101, 102, 103, 104};

        int res1 = StudentSearch.findStudentById(ids, 104);
        assertTest("testBoundaryCondition", res1 == 3, "boundary condition verification failed");

        int res2 = StudentSearch.findStudentById(ids, 101);
        assertTest("testStandardOperation", res2 == 0, "standard operation verification failed");

        int res3 = StudentSearch.findStudentById(ids, 102);
        assertTest("testIntermediateCase", res3 == 1, "intermediate case verification failed");

        int res4 = StudentSearch.findStudentById(ids, 999);
        assertTest("testSecondaryCase", res4 == -1, "secondary case verification failed");

        int res5 = StudentSearch.findStudentById(new int[0], 101);
        assertTest("testEdgeCase", res5 == -1, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
