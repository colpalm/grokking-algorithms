package ch4_quicksort;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] a = {21, 45, 87, 93};

        System.out.println(binarySearchRecursive(a, 93));
        System.out.println(binarySearchRecursive(a, 16));
    }

    public static int binarySearchRecursive(int[] arr, int target) {
        return binarySearchRecursive(arr, target, 0, arr.length -1);
    }

    private static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        // Check if input list is empty or if target does not exist
        if (arr.length == 0 || low > high) {
            return -1;
        }

        int mid = (low + high) / 2;
        int guess = arr[mid];

        if (guess == target) {
            return mid;
        } else if (guess < target) {
            return binarySearchRecursive(arr, target, mid + 1, high);
        } else {
            return binarySearchRecursive(arr, target, low, high - 1);
        }
    }
}
