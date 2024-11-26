package ch3_recursion;

public class ArrLength {
    public static void main(String[] args) {
        int[] a = {1, 4, 10, 18, 2, -4};
        System.out.print(arrLength(a));
    }

    public static int arrLength(int[] arr) {
        return arrLength(arr, 0);
    }

    private static int arrLength(int[] arr, int index) {
        try {
            // Try to access the element at index and if successful continue on
            int temp = arr[index];
            return arrLength(arr, index + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            return index;
        }
    }
}
