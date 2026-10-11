public class PassingMarks {
    public static int countPassingStudents(int[] marks, int passingThreshold) {
        if (marks == null || marks.length == 0) {
            return 0;
        }

        int passingCount = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > passingThreshold) {
                passingCount++;
            }
        }

        return passingCount;
    }
}
