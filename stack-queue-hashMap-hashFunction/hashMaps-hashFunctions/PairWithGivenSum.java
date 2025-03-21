// 2. Given an array and a target sum, find if there exists a pair of elements whose sum is equal to the target.

import java.util.*;

class PairWithGivenSum {
    static boolean hasPair(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println("Pair found: (" + num + ", " + (target - num) + ")");
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, -8};
        int target = 16;
        System.out.println(hasPair(arr, target));
    }
}
