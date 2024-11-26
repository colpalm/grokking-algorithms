package ch3_recursion;

public class MaxFromArray {
    public static void main(String[] args) {
        int[] a = {1, 10, 4, 2, 99, 5};
        System.out.println(maxFromArray(a));
    }

    public static int maxFromArray(int[] arr) {
        return maxFromArray(arr, 0);
    }

    private static int maxFromArray(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int max = maxFromArray(arr, index + 1);
        if (arr[index] > max) {
            return arr[index];
        } else {
            return max;
        }
    }
}
