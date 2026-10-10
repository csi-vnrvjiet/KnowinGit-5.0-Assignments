public class ArrayListInsert {
    public static int insertAtIndex(int[] array, int count, int capacity, int index, int value) {
        if (array == null || count >= capacity) {
            return -1;
        }

        if (index < 0 || index >= count) {
            return -1;
        }

        for (int i = count; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = value;
        return count + 1;
    }
}
