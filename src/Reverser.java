public class Reverser {
    public static String reverse(String word) {
        if (word == null) {
            return "";
        }
        return new StringBuilder(word).reverse().toString();
    }
}
