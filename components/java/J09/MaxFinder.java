public class MaxFinder {
    public static int findMaximum(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int maxVal = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > maxVal) {
                maxVal = numbers[i];
            }
        }

        return maxVal;
    }
}
