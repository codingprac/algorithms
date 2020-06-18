package com.d3.prac.sort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 8, 9, 2, 3, 1, 6, 7, 0};
        int min;
        System.out.println("Unsorted List = " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    arr[j] = arr[i];
                    arr[i] = min;
                }
            }
        }
        System.out.println("sorted List = " + Arrays.toString(arr));
    }
}
