package ch4_quicksort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return; // base case, single element array is already sorted
        }

        // Split and create new arrays
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        // Recursive call
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] original, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                original[k++] = left[i++]; // Post increment operators
            } else {
                original[k++] = right[j++];
            }
        }
        // Copy any remaining elements
        while (i < left.length) {
            original[k++] = left[i++];
        }
        while (j < right.length) {
            original[k++] = right[j++];
        }
    }
}
