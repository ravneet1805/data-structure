package searching.stringBuilder;


import java.util.HashSet;
import java.util.Scanner;

class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = in.nextLine();

        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);

        in.close();
    }
}
