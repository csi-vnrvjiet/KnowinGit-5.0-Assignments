public class SpaceTrimmer {
    public static String trimSpaces(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        int start = (input.charAt(0) == ' ') ? 1 : 0;
        int end = (input.charAt(input.length() - 1) == ' ') ? input.length() - 2 : input.length() - 1;

        if (start > end) {
            return "";
        }

        return input.substring(start, end + 1);
    }
}
