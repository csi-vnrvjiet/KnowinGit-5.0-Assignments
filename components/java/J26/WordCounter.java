public class WordCounter {
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int spaces = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaces++;
            }
        }

        return spaces + 1;
    }
}
