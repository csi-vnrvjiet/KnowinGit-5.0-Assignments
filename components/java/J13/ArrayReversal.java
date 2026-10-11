public class ArrayReversal {
    public static void reverseArray(int[] numbers) {
        if (numbers == null || numbers.length <= 1) {
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
    }
}
