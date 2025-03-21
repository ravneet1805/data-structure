// 3. Given an unsorted array, find the length of the longest consecutive elements sequence.

import java.util.*;

class LongestConsecutiveSequence {
    static int longestSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        int maxLen = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) { // Start of a new sequence
                int currNum = num;
                int currLen = 1;

                while (set.contains(currNum + 1)) {
                    currNum++;
                    currLen++;
                }

                maxLen = Math.max(maxLen, currLen);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence: " + longestSequence(arr));
    }
}
