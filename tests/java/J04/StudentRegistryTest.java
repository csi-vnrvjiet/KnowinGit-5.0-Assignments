public class StudentRegistryTest {
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
        StudentRegistry reg1 = new StudentRegistry(10);
        reg1.registerStudent(101);
        reg1.registerStudent(102);
        reg1.registerStudent(103);
        boolean res1 = reg1.registerStudent(103);
        assertTest("testBoundaryCondition", !res1, "boundary condition verification failed");

        StudentRegistry reg2 = new StudentRegistry(10);
        reg2.registerStudent(101);
        reg2.registerStudent(102);
        reg2.registerStudent(103);
        boolean res2 = reg2.registerStudent(101);
        assertTest("testStandardOperation", !res2 && reg2.getCount() == 3, "standard operation verification failed");

        StudentRegistry reg3 = new StudentRegistry(10);
        reg3.registerStudent(101);
        reg3.registerStudent(102);
        reg3.registerStudent(103);
        boolean res3 = reg3.registerStudent(102);
        assertTest("testIntermediateCase", !res3 && reg3.getCount() == 3, "intermediate case verification failed");

        StudentRegistry reg4 = new StudentRegistry(10);
        reg4.registerStudent(101);
        reg4.registerStudent(102);
        reg4.registerStudent(103);
        boolean res4 = reg4.registerStudent(104);
        assertTest("testSecondaryCase", res4 && reg4.getCount() == 4, "secondary case verification failed");

        StudentRegistry emptyReg = new StudentRegistry(5);
        boolean res5 = emptyReg.registerStudent(201);
        assertTest("testEdgeCase", res5 && emptyReg.getCount() == 1, "edge case verification failed");

        System.out.println("\nRegression Test Results: " + passed + " passed, " + failed + " failed, " + (passed + failed) + " total");
        if (failed > 0) {
            System.exit(1);
        }
    }
}
