package sorting;

// 7. A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.

import java.util.Scanner;

class CountingSort {
    public static void countingSort(int[] arr, int min, int max) {
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        // Count occurrences
        for (int num : arr) {
            count[num - min]++;
        }

        // Cumulative count
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in sorted order
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of students:");
        int n = in.nextInt();
        int[] ages = new int[n];

        System.out.println("Enter student ages (between 10 and 18):");
        for (int i = 0; i < n; i++) {
            ages[i] = in.nextInt();
        }

        countingSort(ages, 10, 18);

        System.out.println("Sorted student ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }

        in.close();
    }
}
