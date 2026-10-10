public class GradeCalculator {
    public static double calculateAverage(int[] marks) {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum / marks.length;
    }
}
