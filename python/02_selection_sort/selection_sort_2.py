class SelectionSort2:
    # This is the more traditional way of running selection sort. Use only one array and swap elements
    def selection_sort(self, arr):
        for i in range(len(arr)):
            smallest_index = i

            for j in range(i + 1, len(arr)):
                if arr[j] < arr[smallest_index]:
                    smallest_index = j

            arr[i], arr[smallest_index] = arr[smallest_index], arr[i]


if __name__ == "__main__":
    ss = SelectionSort2()
    my_list = [5, 3, 6, 2, 10, -5]

    # Don't have to return a list because the mutation happens on the original
    ss.selection_sort(my_list)
    print(my_list)
