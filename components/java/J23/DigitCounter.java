public class DigitCounter {
    public static int countDigits(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int digits = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits++;
            }
        }

        return digits;
    }
}
