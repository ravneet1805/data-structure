package searching.stringBuilder;


import java.util.Scanner;

class ReverseString {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String input = in.nextLine();
        
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);

        in.close();
    }
}
