public class MinFinder {
    public static int findMinimum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int minVal = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < minVal) {
                minVal = numbers[i];
            }
        }

        return minVal;
    }
}
