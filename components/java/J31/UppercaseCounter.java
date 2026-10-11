public class UppercaseCounter {
    public static int countUppercaseLetters(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }

        return count;
    }
}
