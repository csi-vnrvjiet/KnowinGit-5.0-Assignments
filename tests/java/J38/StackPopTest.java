public class StackPopTest {
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
        StackPop s1 = new StackPop();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.pop();
        int top1 = s1.peek();
        assertTest("testBoundaryCondition", top1 == 20, "boundary condition verification failed");

        StackPop s2 = new StackPop();
        s2.push(10);
        int top2 = s2.peek();
        assertTest("testStandardOperation", top2 == 10, "standard operation verification failed");

        StackPop s3 = new StackPop();
        assertTest("testIntermediateCase", s3.peek() == -1, "intermediate case verification failed");

        StackPop s4 = new StackPop();
        s4.push(10);
        s4.push(20);
        assertTest("testSecondaryCase", s4.peek() == 20, "secondary case verification failed");

        StackPop s5 = new StackPop();
        s5.push(5);
        int pop5 = s5.pop();
        assertTest("testEdgeCase", pop5 == 5, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
