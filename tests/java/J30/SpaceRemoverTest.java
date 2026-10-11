public class SpaceRemoverTest {
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
        String res1 = SpaceRemover.removeAllSpaces("a  b c");
        assertTest("testBoundaryCondition", res1.equals("abc"), "boundary condition verification failed");

        String res2 = SpaceRemover.removeAllSpaces("x y");
        assertTest("testStandardOperation", res2.equals("xy"), "standard operation verification failed");

        String res3 = SpaceRemover.removeAllSpaces("hello");
        assertTest("testIntermediateCase", res3.equals("hello"), "intermediate case verification failed");

        String res4 = SpaceRemover.removeAllSpaces("");
        assertTest("testSecondaryCase", res4.equals(""), "secondary case verification failed");

        String res5 = SpaceRemover.removeAllSpaces("ab ");
        assertTest("testEdgeCase", res5.equals("ab"), "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
