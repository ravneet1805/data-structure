package sorting;

// 4. An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.

import java.util.Scanner;

class QuickSort {
    public static void quickSort(double[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(double[] arr, int low, int high) {
        double pivot = arr[high];
        int i = low - 1;
        
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of products:");
        int n = in.nextInt();
        double[] prices = new double[n];

        System.out.println("Enter product prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextDouble();
        }

        quickSort(prices, 0, n - 1);

        System.out.println("Sorted product prices:");
        for (double price : prices) {
            System.out.print(price + " ");
        }


    }
}
