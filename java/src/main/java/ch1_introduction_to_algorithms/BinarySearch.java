package ch1_introduction_to_algorithms;

public class BinarySearch {
    public static void main(String[] args) {
        int[] myList = {21, 45, 87, 93};

        System.out.println(binarySearch(myList, 93));
        System.out.println(binarySearch(myList, 16));
    }

    public static int binarySearch(int[] list, int target) {
        // Check if list is empty
        if (list.length == 0) {
            return -1;
        }

        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];

            if (guess == target) {
                return mid;
            } else if (guess > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
