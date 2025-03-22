package searching.fileReader;
//1. Write a program that uses FileReader to read a text file line by line and print each line to the console.
import java.io.*;

class ReadFile {
    public static void main(String[] args) {
        String filePath = "sample.txt"; // Replace with your file path

        try (FileReader fr = new FileReader(filePath);
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
