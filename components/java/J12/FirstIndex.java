public class FirstIndex {
    public static int findFirstIndex(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return -1;
        }

        int matchIdx = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                matchIdx = i;
            }
        }

        return matchIdx;
    }
}
