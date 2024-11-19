package ch2_selection_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10, -5));
        System.out.println(selection_sort(testList));
    }

    public static List<Integer> selection_sort(List<Integer> arr) {
        List<Integer> outputList = new ArrayList<>(arr.size());
        List<Integer> copyList = new ArrayList<>(arr); // Copy list so original isn't mutated

        int originalSize = copyList.size();
        for (int i = 0; i < originalSize; i++) {
            int smallest_index = findSmallest(copyList);
            outputList.add(copyList.get(smallest_index));
            copyList.remove(smallest_index);
        }
        return outputList;
    }

    public static int findSmallest(List<Integer> arr) {
        int smallestNumber = arr.getFirst();
        int smallestIndex = 0;

        for (int i = 0; i < arr.size(); i++) {
            if( arr.get(i) < smallestNumber) {
                smallestNumber = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
