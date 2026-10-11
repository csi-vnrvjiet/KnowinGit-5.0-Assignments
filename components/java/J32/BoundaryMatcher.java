public class BoundaryMatcher {
    public static boolean startsAndEndsWithSameChar(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        if (str.length() == 1) {
            return false;
        }

        return str.charAt(0) == str.charAt(str.length() - 1);
    }
}
