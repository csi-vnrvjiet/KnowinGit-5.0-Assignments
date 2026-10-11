public class ExactMatch {
    public static boolean isExactMatch(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return str1 == str2;
        }

        return str2.startsWith(str1);
    }
}
