public class LongestNameTest {
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
        String[] n1 = {"Bob", "Alice", "Christopher"};
        String res1 = LongestName.findLongestName(n1);
        assertTest("testBoundaryCondition", res1.equals("Christopher"), "boundary condition verification failed");

        String[] n2 = {"Alexander", "Bob", "Charlie"};
        String res2 = LongestName.findLongestName(n2);
        assertTest("testStandardOperation", res2.equals("Alexander"), "standard operation verification failed");

        String[] n3 = {"Al", "Jonathan", "Ed"};
        String res3 = LongestName.findLongestName(n3);
        assertTest("testIntermediateCase", res3.equals("Jonathan"), "intermediate case verification failed");

        String[] n4 = {"Anna", "Dave"};
        String res4 = LongestName.findLongestName(n4);
        assertTest("testSecondaryCase", res4.equals("Anna"), "secondary case verification failed");

        String[] n5 = {"Sam"};
        String res5 = LongestName.findLongestName(n5);
        assertTest("testEdgeCase", res5.equals("Sam"), "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
