class SelectionSort:

    def selection_sort(self, arr):
        output_arr = []
        arr_copy = list(arr)  # make a copy of the array so original is not mutated

        for i in range(len(arr_copy)):
            smallest_index = self.find_smallest(arr_copy)
            output_arr.append(arr_copy.pop(smallest_index))

        return output_arr

    def find_smallest(self, arr):
        smallest_index = 0
        smallest_number = arr[0]

        for i in range(1, len(arr)):
            if arr[i] < smallest_number:
                smallest_index = i
                smallest_number = arr[i]

        return smallest_index


if __name__ == "__main__":
    ss = SelectionSort()
    my_list = [5, 3, 6, 2, 10, -5]

    print(ss.selection_sort(my_list))
