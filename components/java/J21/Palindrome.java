public class Palindrome {
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        }

        int len = str.length();
        if (len <= 1) {
            return true;
        }

        int left, right;
        if (len % 2 != 0) {
            left = len / 2 - 1;
            right = len / 2 + 1;
        } else {
            left = len / 2 - 1;
            right = len / 2 + 1;
        }

        while (left >= 0 && right < len) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left--;
            right++;
        }

        return true;
    }
}
