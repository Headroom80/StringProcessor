public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");


        String phrase = "As you walk on the way, the way appears";
        int wordCount = WordCounter.wordsCount(phrase);
        System.out.println("Count pour le mot : \"" + phrase + "\" est " + wordCount);


        String word = "hello";
        String reversedWord = Reverser.reverse(word);
        System.out.println("Le mot \"" + word + "\"  En Reverse est : " + reversedWord);


        String palindromeWord = "radar";
        boolean isPalindrome = Palindrom.isPalindrome(palindromeWord);
        System.out.println("Le mot \"" + palindromeWord + "\" est-il un Palindrome? " + isPalindrome);
    }
}