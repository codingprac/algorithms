package com.d3.prac.sort;

import java.util.Arrays;

public class MergeSort {

    private static void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, helper, low, mid); // left half
            mergeSort(arr, helper, mid + 1, high); // right half
            merge(arr, helper, low, mid, high); // merge them
        }
    }

    private static void merge(int[] arr, int[] helper, int low, int mid, int high) {
        for (int i = 0; i <= high; i++) {
            helper[i] = arr[i];
        }

        int indexLeft = low;
        int indexRight = mid + 1;
        int current = low;

        while (indexLeft <= mid && indexRight <= high) {
            if (helper[indexLeft] <= helper[indexRight] && indexRight <= high) {
                arr[current] = helper[indexLeft];
                indexLeft++;
            } else {
                arr[current] = helper[indexRight];
                indexRight++;
            }
            current++;
        }

        int rem = mid - indexLeft;
        for (int i = 0; i <= rem; i++) {
            arr[current + i] = helper[indexLeft + i];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 8, 9, 2, 3, 1, 6, 7, 0};

        int[] helper = new int[arr.length];

        mergeSort(arr, helper, 0, arr.length - 1);

        System.out.println("arr.toString() = " + Arrays.toString(arr));
    }


}
