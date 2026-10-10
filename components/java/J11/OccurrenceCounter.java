public class OccurrenceCounter {
    public static int countOccurrences(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int matches = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == target) {
                matches++;
            }
        }

        return matches;
    }
}
