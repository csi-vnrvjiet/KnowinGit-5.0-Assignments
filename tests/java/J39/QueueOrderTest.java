public class QueueOrderTest {
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
        QueueOrder q1 = new QueueOrder();
        q1.enqueue('A');
        q1.enqueue('B');
        q1.enqueue('C');
        q1.dequeue();
        char front1 = q1.peek();
        assertTest("testBoundaryCondition", front1 == 'B', "boundary condition verification failed");

        QueueOrder q2 = new QueueOrder();
        q2.enqueue('X');
        char front2 = q2.peek();
        assertTest("testStandardOperation", front2 == 'X', "standard operation verification failed");

        QueueOrder q3 = new QueueOrder();
        char front3 = q3.peek();
        assertTest("testIntermediateCase", front3 == '\0', "intermediate case verification failed");

        QueueOrder q4 = new QueueOrder();
        q4.enqueue('A');
        q4.enqueue('B');
        char front4 = q4.peek();
        assertTest("testSecondaryCase", front4 == 'A', "secondary case verification failed");

        QueueOrder q5 = new QueueOrder();
        char deq5 = q5.dequeue();
        assertTest("testEdgeCase", deq5 == '\0', "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
