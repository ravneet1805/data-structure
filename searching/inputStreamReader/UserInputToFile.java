package searching.inputStreamReader;
// 2. Write a program that uses InputStreamReader to read user input from the console and write the input to a file. Each input should be written as a new line in the file.

import java.io.*;

class UserInputToFile {
    public static void main(String[] args) {
        String filePath = "output.txt"; // Replace with your file path

        try (InputStreamReader isr = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(isr);
             FileWriter fw = new FileWriter(filePath)) {

            System.out.println("Enter text (type 'exit' to stop):");

            String line;
            while (!(line = br.readLine()).equalsIgnoreCase("exit")) {
                fw.write(line + System.lineSeparator());
            }

            System.out.println("User input saved to " + filePath);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
