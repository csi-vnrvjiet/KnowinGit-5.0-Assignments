public class CharReplaceTest {
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
        String res1 = CharReplace.replaceAllChars("banana", 'a', 'o');
        assertTest("testBoundaryCondition", res1.equals("bonono"), "boundary condition verification failed");

        String res2 = CharReplace.replaceAllChars("cat", 'a', 'o');
        assertTest("testStandardOperation", res2.equals("cot"), "standard operation verification failed");

        String res3 = CharReplace.replaceAllChars("dog", 'x', 'y');
        assertTest("testIntermediateCase", res3.equals("dog"), "intermediate case verification failed");

        String res4 = CharReplace.replaceAllChars("", 'a', 'b');
        assertTest("testSecondaryCase", res4.equals(""), "secondary case verification failed");

        String res5 = CharReplace.replaceAllChars("ant", 'a', 'u');
        assertTest("testEdgeCase", res5.equals("unt"), "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
