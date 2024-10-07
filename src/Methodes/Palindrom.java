package Methodes;

public class Palindrom {
    public static boolean isPalindrome(String word) {
        if (word == null) {
            return false;
        }
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversed);
    }
}
