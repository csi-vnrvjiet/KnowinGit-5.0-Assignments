public class NameComparison {
    public static boolean compareNamesCaseInsensitive(String name1, String name2) {
        if (name1 == null || name2 == null) {
            return name1 == name2;
        }

        return name1.equals(name2);
    }
}
