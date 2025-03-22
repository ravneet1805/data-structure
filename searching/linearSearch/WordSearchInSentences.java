package searching.linearSearch;
// 2. You are given an array of sentences (strings). Write a program that performs Linear Search to find the first sentence containing a specific word. If the word is found, return the sentence. If no sentence contains the word, return "Not Found".

class WordSearchInSentences {
    public static void main(String[] args) {
        String[] sentences = {
            "The sky is blue.",
            "Hello world!",
            "Java is a powerful language.",
            "Programming is fun."
        };
        String searchWord = "Java";
        String result = findSentenceContainingWord(sentences, searchWord);
        System.out.println("Sentence containing '" + searchWord + "': " + result);
    }

    // Method to find the first sentence containing a specific word
    public static String findSentenceContainingWord(String[] sentences, String word) {
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // Return first matching sentence
            }
        }
        return "Not Found"; // No sentence contains the word
    }
}
