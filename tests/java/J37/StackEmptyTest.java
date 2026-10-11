public class StackEmptyTest {
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
        StackEmpty s1 = new StackEmpty();
        s1.push(42);
        s1.pop();
        boolean empty1 = s1.isEmpty();
        int peek1 = s1.peek();
        assertTest("testBoundaryCondition", empty1 && peek1 == -1, "boundary condition verification failed");

        StackEmpty s2 = new StackEmpty();
        assertTest("testStandardOperation", s2.isEmpty(), "standard operation verification failed");

        StackEmpty s3 = new StackEmpty();
        s3.push(10);
        s3.push(20);
        s3.pop();
        assertTest("testIntermediateCase", s3.peek() == 10 && !s3.isEmpty(), "intermediate case verification failed");

        StackEmpty s4 = new StackEmpty();
        assertTest("testSecondaryCase", s4.pop() == -1, "secondary case verification failed");

        StackEmpty s5 = new StackEmpty();
        s5.push(99);
        assertTest("testEdgeCase", s5.peek() == 99, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
