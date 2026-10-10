public class PassingMarksTest {
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
        int[] m1 = {39, 40, 41};
        int res1 = PassingMarks.countPassingStudents(m1, 40);
        assertTest("testBoundaryCondition", res1 == 2, "boundary condition verification failed");

        int[] m2 = {50, 60, 70};
        int res2 = PassingMarks.countPassingStudents(m2, 40);
        assertTest("testStandardOperation", res2 == 3, "standard operation verification failed");

        int[] m3 = {10, 20, 35};
        int res3 = PassingMarks.countPassingStudents(m3, 40);
        assertTest("testIntermediateCase", res3 == 0, "intermediate case verification failed");

        int[] m4 = {45};
        int res4 = PassingMarks.countPassingStudents(m4, 40);
        assertTest("testSecondaryCase", res4 == 1, "secondary case verification failed");

        int res5 = PassingMarks.countPassingStudents(new int[0], 40);
        assertTest("testEdgeCase", res5 == 0, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
