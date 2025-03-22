package searching.binarySearch;

// 3. A peak element is an element that is greater than its neighbors. Write a program that performs Binary Search to find a peak element in an array. If there are multiple peak elements, return any one of them.

class PeakElementSearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2, 6, 7};
        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element index: " + peakIndex + " (Value: " + arr[peakIndex] + ")");
    }

    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left; // Peak element index
    }
}
