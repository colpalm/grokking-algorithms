package ch2_selection_sort;

import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] testArray = {5, 3, 6, 2, 10, -5};

        // Don't have to return a list because the mutation happens on the original
        selectionSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    public static void selectionSort(int[] arr) {
        // More traditional way of selection sort - mutating the original array
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
