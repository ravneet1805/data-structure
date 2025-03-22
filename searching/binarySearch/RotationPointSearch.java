package searching.binarySearch;

// 1. You are given a rotated sorted array. Write a program that performs Binary Search to find the index of the smallest element in the array (the rotation point).

class RotationPointSearch {
    public static void main(String[] args) {
        int[] rotatedArray = {4, 5, 6, 7, 0, 1, 2};
        int rotationPoint = findRotationPoint(rotatedArray);
        System.out.println("Rotation point index: " + rotationPoint);
    }

    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // Index of the smallest element (rotation point)
    }
}
