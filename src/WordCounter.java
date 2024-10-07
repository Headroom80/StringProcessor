public class WordCounter {
    public static int wordsCount(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return 0;
        }
        return phrase.split("\\s+").length;
    }
}
