package sorting;

import java.util.*;
// 1. A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.


    class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter total students:");
        int n = in.nextInt();
        
        int[] marks = new int[n];
        System.out.println("enter marks: ");
        for(int i = 0; i< marks.length; i++){
            marks[i] = in.nextInt();
        }

        // Bubble Sort
        for(int i = 0; i < marks.length - 1; i++) {
            for(int j = 0; j < marks.length - i - 1; j++) {
                if(marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j + 1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }


        System.out.println("Sorted marks:");
        for(int i =0; i< n; i++) {
            System.out.print(marks[i] + " ");
        }



    }
    
}
