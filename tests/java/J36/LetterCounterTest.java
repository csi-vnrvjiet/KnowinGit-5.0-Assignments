public class LetterCounterTest {
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
        int res1 = LetterCounter.countLettersOnly("A1 b!");
        assertTest("testBoundaryCondition", res1 == 2, "boundary condition verification failed");

        int res2 = LetterCounter.countLettersOnly("abc");
        assertTest("testStandardOperation", res2 == 3, "standard operation verification failed");

        int res3 = LetterCounter.countLettersOnly("   ");
        assertTest("testIntermediateCase", res3 == 0, "intermediate case verification failed");

        int res4 = LetterCounter.countLettersOnly("Z");
        assertTest("testSecondaryCase", res4 == 1, "secondary case verification failed");

        int res5 = LetterCounter.countLettersOnly("");
        assertTest("testEdgeCase", res5 == 0, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
