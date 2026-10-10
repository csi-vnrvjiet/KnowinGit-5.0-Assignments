public class StudentRecords {
    public static int removeStudent(int[] studentIds, int count, int targetId) {
        if (studentIds == null || count <= 0) {
            return count;
        }

        int targetIndex = -1;
        for (int i = 0; i < count; i++) {
            if (studentIds[i] == targetId) {
                targetIndex = i;
                break;
            }
        }

        if (targetIndex == -1) {
            return count;
        }

        for (int i = targetIndex; i < count - 2; i++) {
            studentIds[i] = studentIds[i + 1];
        }

        return count - 1;
    }
}
