public class EvenCounter {
    public static int countEvenNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        int evens = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] % 2 == 0) {
                evens++;
            }
        }

        return evens;
    }
}
