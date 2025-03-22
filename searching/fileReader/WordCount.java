package searching.fileReader;
// 2. Write a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.
import java.io.*;

class WordCount {
    public static int countWordOccurrences(String filePath, String targetWord) {
        int count = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by spaces
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return count;
    }

    public static void main(String[] args) {
        String filePath = "sample.txt"; // Replace with your file path
        String targetWord = "hello"; // Replace with the word to count

        int occurrences = countWordOccurrences(filePath, targetWord);
        System.out.println("The word '" + targetWord + "' appears " + occurrences + " times in the file.");
    }
}
