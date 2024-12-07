package ch4_quicksort;

public class SumArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        System.out.println(sumArray(a));
    }

    public static int sumArray(int[] arr) {
        return sumArray(arr, 0);
    }

    private static int sumArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        return arr[index] + sumArray(arr, index + 1);
    }
}
