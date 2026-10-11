public class SpaceRemover {
    public static String removeAllSpaces(String str) {
        if (str == null) {
            return null;
        }

        char[] arr = str.toCharArray();
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == ' ') {
                for (int j = i; j < len - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                len--;
            }
        }

        return new String(arr, 0, len);
    }
}
