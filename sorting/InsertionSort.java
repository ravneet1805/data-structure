package sorting;

// 2. A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.

import java.util.Scanner;

class InsertionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of employees:");
        int n = in.nextInt();
        int[] empIDs = new int[n];

        System.out.println("Enter Employee IDs:");
        for (int i = 0; i < n; i++) {
            empIDs[i] = in.nextInt();
        }

        // Insertion Sort
        for (int i = 1; i < n; i++) {
            int key = empIDs[i];
            int j = i - 1;
            while (j >= 0 && empIDs[j] > key) {
                empIDs[j + 1] = empIDs[j];
                j--;
            }
            empIDs[j + 1] = key;
        }

        System.out.println("Sorted Employee IDs:");
        for (int id : empIDs) {
            System.out.print(id + " ");
        }

    }
}
