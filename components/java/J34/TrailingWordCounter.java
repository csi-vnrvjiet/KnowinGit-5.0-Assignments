public class TrailingWordCounter {
    public static int countWordsTrailing(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int words = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                words++;
            }
        }

        return words + 1;
    }
}
