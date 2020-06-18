package com.d3.prac.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 8, 9, 2, 3, 1, 6, 7, 0};
        System.out.println("Unsorted List = " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int swap = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = swap;
                j--;
            }
        }
        System.out.println("sorted List = " + Arrays.toString(arr));
    }
}
