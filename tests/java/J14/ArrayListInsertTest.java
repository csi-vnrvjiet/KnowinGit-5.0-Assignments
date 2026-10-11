public class ArrayListInsertTest {
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
        int[] arr1 = new int[10];
        arr1[0] = 10; arr1[1] = 20; arr1[2] = 30;
        int newCount1 = ArrayListInsert.insertAtIndex(arr1, 3, 10, 3, 40);
        assertTest("testBoundaryCondition", newCount1 == 4 && arr1[3] == 40 && arr1[0] == 10, "boundary condition verification failed");

        int[] arr2 = new int[10];
        arr2[0] = 10; arr2[1] = 20;
        int newCount2 = ArrayListInsert.insertAtIndex(arr2, 2, 10, 0, 5);
        assertTest("testStandardOperation", newCount2 == 3 && arr2[0] == 5 && arr2[1] == 10 && arr2[2] == 20, "standard operation verification failed");

        int[] arr3 = new int[10];
        arr3[0] = 10; arr3[1] = 30;
        int newCount3 = ArrayListInsert.insertAtIndex(arr3, 2, 10, 1, 20);
        assertTest("testIntermediateCase", newCount3 == 3 && arr3[1] == 20, "intermediate case verification failed");

        int newCount4 = ArrayListInsert.insertAtIndex(arr1, 3, 10, -1, 99);
        assertTest("testSecondaryCase", newCount4 == -1, "secondary case verification failed");

        int newCount5 = ArrayListInsert.insertAtIndex(arr1, 3, 10, 99, 99);
        assertTest("testEdgeCase", newCount5 == -1, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
