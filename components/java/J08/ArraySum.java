public class ArraySum {
    public static int sumArray(int[] values) {
        if (values == null || values.length == 0) {
            return 0;
        }

        int total = 0;
        for (int i = 1; i < values.length; i++) {
            total += values[i];
        }

        return total;
    }
}
