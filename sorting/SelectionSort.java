package sorting;

// 5. A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.

import java.util.Scanner;

class SelectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = in.nextInt();
        int[] scores = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }

        System.out.println("Sorted exam scores:");
        for (int score : scores) {
            System.out.print(score + " ");
        }

        in.close();
    }
}
