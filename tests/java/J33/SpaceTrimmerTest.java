public class SpaceTrimmerTest {
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
        String res1 = SpaceTrimmer.trimSpaces("   Rahul Kumar  ");
        assertTest("testBoundaryCondition", res1.equals("Rahul Kumar"), "boundary condition verification failed");

        String res2 = SpaceTrimmer.trimSpaces("John Doe");
        assertTest("testStandardOperation", res2.equals("John Doe"), "standard operation verification failed");

        String res3 = SpaceTrimmer.trimSpaces(" Alice ");
        assertTest("testIntermediateCase", res3.equals("Alice"), "intermediate case verification failed");

        String res4 = SpaceTrimmer.trimSpaces("");
        assertTest("testSecondaryCase", res4.equals(""), "secondary case verification failed");

        String res5 = SpaceTrimmer.trimSpaces("A");
        assertTest("testEdgeCase", res5.equals("A"), "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
