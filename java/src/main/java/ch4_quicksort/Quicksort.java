package ch4_quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quicksort {
    public static void main(String[] args) {
        int[] a = {5, 2, 7, -1, 5, -9, 3};
        System.out.println(Arrays.toString(quicksortNewArrays(a)));
        System.out.println("-----");
        int[] a2 = {3, 6, 8, 10, 1, 2, 1};
        quicksortInPlace(a2, 0, a2.length - 1);
        System.out.println(Arrays.toString(a2));
    }

    // Not a common implementation in Java
    public static int[] quicksortNewArrays(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        List<Integer> smaller_elements = new ArrayList<>();
        List<Integer> larger_elements = new ArrayList<>();

        int pivot = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < pivot) {
                smaller_elements.add(arr[i]);
            } else {
                larger_elements.add(arr[i]);
            }
        }

        // Convert back to array and recursive call
        int[] sorted_left = quicksortNewArrays(smaller_elements.stream().mapToInt(i -> i).toArray());
        int[] sorted_right = quicksortNewArrays(larger_elements.stream().mapToInt(i -> i).toArray());

        // Combine results into a single array
        return combine(sorted_left, pivot, sorted_right);
    }

    public static int[] combine(int[] left, int pivot, int[] right) {
        int[] result = new int[left.length + 1 + right.length];
        System.arraycopy(left, 0, result, 0, left.length);
        result[left.length] = pivot;
        System.arraycopy(right, 0, result, left.length + 1, right.length);
        return result;
    }

    public static void quicksortInPlace(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partitionInPlace(arr, low, high);

            quicksortInPlace(arr, low, pi - 1);
            quicksortInPlace(arr, pi + 1, high);
        }
    }

    public static int partitionInPlace(int[] arr, int low, int high) {
        int pivot = arr[high]; // pivot at the end
        int i = low - 1; // pointer for smaller elements

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap elements - < pivot move to the front
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // Move pivot to the correct location
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
