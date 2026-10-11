public class StudentSearch {
    public static int findStudentById(int[] studentIds, int targetId) {
        if (studentIds == null || studentIds.length == 0) {
            return -1;
        }

        for (int i = 0; i < studentIds.length - 1; i++) {
            if (studentIds[i] == targetId) {
                return i;
            }
        }

        return -1;
    }
}
