public class GradeCalculatorTest {
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
        int[] m1 = {80, 81};
        double res1 = GradeCalculator.calculateAverage(m1);
        assertTest("testBoundaryCondition", Math.abs(res1 - 80.5) < 0.001, "boundary condition verification failed");

        int[] m2 = {70, 80, 90};
        double res2 = GradeCalculator.calculateAverage(m2);
        assertTest("testStandardOperation", Math.abs(res2 - 80.0) < 0.001, "standard operation verification failed");

        int[] m3 = {100};
        double res3 = GradeCalculator.calculateAverage(m3);
        assertTest("testIntermediateCase", Math.abs(res3 - 100.0) < 0.001, "intermediate case verification failed");

        int[] m4 = {10, 20, 30, 40};
        double res4 = GradeCalculator.calculateAverage(m4);
        assertTest("testSecondaryCase", Math.abs(res4 - 25.0) < 0.001, "secondary case verification failed");

        double res5 = GradeCalculator.calculateAverage(new int[0]);
        assertTest("testEdgeCase", Math.abs(res5 - 0.0) < 0.001, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
