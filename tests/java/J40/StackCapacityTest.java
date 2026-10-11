public class StackCapacityTest {
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
        StackCapacity s1 = new StackCapacity();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        boolean res1 = s1.push(40);
        assertTest("testBoundaryCondition", !res1, "boundary condition verification failed");

        StackCapacity s2 = new StackCapacity();
        boolean res2 = s2.push(10);
        assertTest("testStandardOperation", res2, "standard operation verification failed");

        StackCapacity s3 = new StackCapacity();
        s3.push(10);
        boolean res3 = s3.push(20);
        assertTest("testIntermediateCase", res3, "intermediate case verification failed");

        StackCapacity s4 = new StackCapacity();
        assertTest("testSecondaryCase", s4.peek() == -1, "secondary case verification failed");

        StackCapacity s5 = new StackCapacity();
        s5.push(99);
        int pop5 = s5.pop();
        assertTest("testEdgeCase", pop5 == 99, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
