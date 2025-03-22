package searching.linearSearch;

//1. You are given an integer array. Write a program that performs Linear Search to find the first negative number in the array. If a negative number is found, return its index. If no negative number is found, return -1.

class FirstNegativeNumberSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 0, -2, 4, -6, 9};
        int negativeIndex = findFirstNegative(numbers);
        System.out.println("First negative number index: " + negativeIndex);
    }

    // Method to find the first negative number in an array
    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // Return index of first negative number
            }
        }
        return -1; // No negative number found
    }
}
