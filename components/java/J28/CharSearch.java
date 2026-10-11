public class CharSearch {
    public static int findCharIndex(String str, char target) {
        if (str == null) {
            return -1;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }
}
