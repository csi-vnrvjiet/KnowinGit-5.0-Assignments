public class LetterCounter {
    public static int countLettersOnly(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }

        return count;
    }
}
