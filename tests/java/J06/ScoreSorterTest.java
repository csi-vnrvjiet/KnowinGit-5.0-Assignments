public class ScoreSorterTest {
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
        int[] s1 = {5, 4, 3, 2, 1};
        ScoreSorter.sortScores(s1);
        assertTest("testBoundaryCondition", s1[0] == 1 && s1[1] == 2 && s1[2] == 3 && s1[3] == 4 && s1[4] == 5, "boundary condition verification failed");

        int[] s2 = {10, 20, 30};
        ScoreSorter.sortScores(s2);
        assertTest("testStandardOperation", s2[0] == 10 && s2[1] == 20 && s2[2] == 30, "standard operation verification failed");

        int[] s3 = {2, 2, 2};
        ScoreSorter.sortScores(s3);
        assertTest("testIntermediateCase", s3[0] == 2 && s3[1] == 2 && s3[2] == 2, "intermediate case verification failed");

        int[] s4 = {42};
        ScoreSorter.sortScores(s4);
        assertTest("testSecondaryCase", s4[0] == 42, "secondary case verification failed");

        int[] s5 = {1, 2};
        ScoreSorter.sortScores(s5);
        assertTest("testEdgeCase", s5[0] == 1 && s5[1] == 2, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
