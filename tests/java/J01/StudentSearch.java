public class StudentSearch {
    public static int findStudentById(int[] ids, int target) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == target) {
                return 1;
            }
        }
        return -1;
    }
}
