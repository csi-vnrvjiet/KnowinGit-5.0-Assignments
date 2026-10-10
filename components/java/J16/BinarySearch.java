public class BinarySearch {
    public static int binarySearch(int[] array, int target) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int low = 1;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
