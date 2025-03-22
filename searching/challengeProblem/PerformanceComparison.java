package searching.challengeProblem;

import java.io.*;

class PerformanceComparison {
    public static void main(String[] args) {
        compareStringBuilders();
        countWordsInLargeFile("largefile.txt"); // Replace with the actual file path
    }

    // Method to compare StringBuilder and StringBuffer performance
    public static void compareStringBuilders() {
        int iterations = 1_000_000;
        String text = "hello";

        // Using StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    // Method to count words in a large file
    public static void countWordsInLargeFile(String filePath) {
        long wordCount = 0;

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Splitting on whitespace
                wordCount += words.length;
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        System.out.println("Total word count in file: " + wordCount);
    }
}
