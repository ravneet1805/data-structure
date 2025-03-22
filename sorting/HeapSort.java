package sorting;

// 6. A company receives job applications with different expected salary demands. Implement Heap Sort to sort these salary demands in ascending order.

import java.util.Scanner;

class HeapSort {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        // Extract elements one by one
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) largest = left;
        if (right < n && arr[right] > arr[largest]) largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of applicants:");
        int n = in.nextInt();
        int[] salaries = new int[n];

        System.out.println("Enter salary expectations:");
        for (int i = 0; i < n; i++) {
            salaries[i] = in.nextInt();
        }

        heapSort(salaries);

        System.out.println("Sorted salary expectations:");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }


    }
}
