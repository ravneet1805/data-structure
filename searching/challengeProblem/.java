package searching.challengeProblem;

// 1. You are given a list of integers. Write a program that uses Linear Search to find the first missing positive integer in the list and Binary Search to find the index of a given target number.

import java.util.Arrays;

class SearchOperations {
    public static void main(String[] args) {
        int[] nums = {3, 4, -1, 1}; // Example input for missing positive integer
        int target = 4; // Example target for binary search

        int missingNumber = findFirstMissingPositive(nums);
        System.out.println("First missing positive integer: " + missingNumber);

        Arrays.sort(nums); // Sorting for binary search
        System.out.println("Sorted Array: " + Arrays.toString(nums));

        int targetIndex = binarySearch(nums, target);
        System.out.println("Target index: " + targetIndex);
    }

    // Linear Search: Find first missing positive integer
    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;
        
        // Step 1: Place each number in its correct position if possible
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                swap(nums, i, nums[i] - 1);
            }
        }

        // Step 2: Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1; // If all numbers are in place, return next positive integer
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Binary Search: Find index of target number
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1; // Target not found
    }
}
