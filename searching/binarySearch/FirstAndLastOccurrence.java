package searching.binarySearch;

// 4. Given a sorted array and a target element, write a program that uses Binary Search to find the first and last occurrence of the target element in the array. If the element is not found, return -1.

class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int[] result = findFirstAndLastOccurrence(sortedArray, target);
        System.out.println("First occurrence: " + result[0] + ", Last occurrence: " + result[1]);
    }

    public static int[] findFirstAndLastOccurrence(int[] arr, int target) {
        int first = findOccurrence(arr, target, true);
        int last = findOccurrence(arr, target, false);
        return new int[]{first, last};
    }

    private static int findOccurrence(int[] arr, int target, boolean findFirst) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                if (findFirst) {
                    right = mid - 1; // Search in left half
                } else {
                    left = mid + 1; // Search in right half
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }
}
