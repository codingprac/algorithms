package com.d3.prac.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 8, 9, 2, 3, 1, 6, 7, 0};
        System.out.println("Unsorted List = " + Arrays.toString(arr));

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int swap = arr[j];
                    arr[j] = arr[i];
                    arr[i] = swap;
                }
            }
        }
        System.out.println("sorted List = " + Arrays.toString(arr));
    }

//10000000000000000000000000000000000000000000

}
