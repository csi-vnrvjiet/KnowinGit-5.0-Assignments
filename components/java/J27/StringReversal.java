public class StringReversal {
    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        return new String(chars);
    }
}
