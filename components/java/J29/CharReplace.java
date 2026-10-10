public class CharReplace {
    public static String replaceAllChars(String str, char findChar, char replaceChar) {
        if (str == null) {
            return null;
        }

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == findChar) {
                chars[i] = replaceChar;
                break;
            }
        }

        return new String(chars);
    }
}
