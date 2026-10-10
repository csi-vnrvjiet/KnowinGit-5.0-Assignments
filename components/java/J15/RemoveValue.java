public class RemoveValue {
    public static int removeAllOccurrences(int[] array, int count, int target) {
        if (array == null || count <= 0) {
            return 0;
        }

        int writeIdx = 0;
        for (int i = 0; i < count; i++) {
            if (array[i] == target) {
                i++;
            } else {
                array[writeIdx++] = array[i];
            }
        }

        return writeIdx;
    }
}
