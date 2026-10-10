public class StudentRecordsTest {
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
        int[] ids1 = {101, 102, 103, 104};
        int newCount1 = StudentRecords.removeStudent(ids1, 4, 102);
        assertTest("testBoundaryCondition", newCount1 == 3 && ids1[0] == 101 && ids1[1] == 103 && ids1[2] == 104, "boundary condition verification failed");

        int[] ids2 = {101, 102, 103, 104};
        int newCount2 = StudentRecords.removeStudent(ids2, 4, 999);
        assertTest("testStandardOperation", newCount2 == 4, "standard operation verification failed");

        int[] ids3 = {101, 102, 103, 104};
        int newCount3 = StudentRecords.removeStudent(ids3, 4, 104);
        assertTest("testIntermediateCase", newCount3 == 3 && ids3[2] == 103, "intermediate case verification failed");

        int newCount4 = StudentRecords.removeStudent(ids1, 0, 101);
        assertTest("testSecondaryCase", newCount4 == 0, "secondary case verification failed");

        int[] ids5 = {500};
        int newCount5 = StudentRecords.removeStudent(ids5, 1, 500);
        assertTest("testEdgeCase", newCount5 == 0, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
