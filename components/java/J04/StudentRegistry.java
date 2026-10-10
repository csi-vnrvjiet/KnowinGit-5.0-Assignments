public class StudentRegistry {
    private int[] studentIds;
    private int count;
    private int capacity;

    public StudentRegistry(int capacity) {
        this.capacity = capacity;
        this.studentIds = new int[capacity];
        this.count = 0;
    }

    public int getCount() { return count; }
    public int[] getStudentIds() { return studentIds; }

    public boolean registerStudent(int newId) {
        if (count >= capacity) {
            return false;
        }

        for (int i = 0; i < count - 1; i++) {
            if (studentIds[i] == newId) {
                return false;
            }
        }

        studentIds[count] = newId;
        count++;
        return true;
    }
}
