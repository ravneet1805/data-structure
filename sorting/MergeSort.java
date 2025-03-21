package sorting;

// 3. A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.

import java.util.Scanner;

class MergeSort {
    public static void mergeSort(double[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(double[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        double[] leftArray = new double[n1];
        double[] rightArray = new double[n2];

        for (int i = 0; i < n1; i++) leftArray[i] = arr[left + i];
        for (int i = 0; i < n2; i++) rightArray[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i++];
            } else {
                arr[k] = rightArray[j++];
            }
            k++;
        }

        while (i < n1) arr[k++] = leftArray[i++];
        while (j < n2) arr[k++] = rightArray[j++];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of books:");
        int n = in.nextInt();
        double[] prices = new double[n];

        System.out.println("Enter book prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = in.nextDouble();
        }

        mergeSort(prices, 0, n - 1);

        System.out.println("Sorted book prices:");
        for (double price : prices) {
            System.out.print(price + " ");
        }

        in.close();
    }
}
