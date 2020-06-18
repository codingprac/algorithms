package com.d3.prac.sort;

import java.util.Arrays;

public class QuickSort {

    private static void quickSort(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) { // sort left half
            quickSort(arr, left, index - 1);
        }
        if (index < right) { // sort right half
            quickSort(arr, index, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];

        while (left < right) {
            while (arr[left] < pivot) left++;
            while (arr[right] > pivot) right--;

            if (left < right) {
                int swap = arr[left];
                arr[left] = arr[right];
                arr[right] = swap;
                left++;
                right--;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 8, 9, 2, 3, 1, 6, 7, 0};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Quick Sort : "+ Arrays.toString(arr));
    }


}
