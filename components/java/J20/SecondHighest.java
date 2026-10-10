public class SecondHighest {
    public static int findSecondHighest(int[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > first) {
                second = first;
                first = array[i];
            } else if (array[i] >= second) {
                second = array[i];
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}
