public class VowelCounter {
    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }
}
