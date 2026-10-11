public class LeftRotate {
    public static void rotateLeft(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int first = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = array[0];
    }
}
