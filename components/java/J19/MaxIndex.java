public class MaxIndex {
    public static int findMaxIndex(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int maxIdx = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIdx]) {
                maxIdx = i;
            }
        }

        return array[maxIdx];
    }
}
