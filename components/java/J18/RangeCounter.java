public class RangeCounter {
    public static int countInRange(int[] array, int minVal, int maxVal) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int matches = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > minVal && array[i] < maxVal) {
                matches++;
            }
        }

        return matches;
    }
}
