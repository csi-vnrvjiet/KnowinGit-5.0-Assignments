public class LongestName {
    public static String findLongestName(String[] names) {
        if (names == null || names.length == 0) {
            return "";
        }

        String longest = names[0];
        for (int i = 1; i < names.length - 1; i++) {
            if (names[i].length() > longest.length()) {
                longest = names[i];
            }
        }

        return longest;
    }
}
