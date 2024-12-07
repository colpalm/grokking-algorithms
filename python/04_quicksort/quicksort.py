# Common implementation in python
def quicksort_new_arrays(arr: list):
    if len(arr) < 2:
        return arr

    pivot = arr[0]

    # Could put these in a single for loop
    less_elements = [i for i in arr[1:] if i <= pivot]
    greater_elements = [i for i in arr[1:] if i > pivot]
    return quicksort_new_arrays(less_elements) + [pivot] + quicksort_new_arrays(greater_elements)


def quicksort_in_place(arr: list, low: int, high: int):
    if low < high:
        pi = partition(arr, low, high)

        quicksort_in_place(arr, low, pi - 1)
        quicksort_in_place(arr, pi + 1, high)


def partition(input_arr: list, low: int, high: int):
    pivot = input_arr[high]  # pivot is last element
    i = low - 1  # pointer for smaller elements

    for j in range(low, high):
        if input_arr[j] <= pivot:
            i += 1
            input_arr[i], input_arr[j] = input_arr[j], input_arr[i]  # swap

    # move the pivot
    input_arr[i + 1], input_arr[high] = input_arr[high], input_arr[i + 1]
    return i + 1


if __name__ == "__main__":
    arr1 = [3, 6, 8, 10, 1, 2, 1]
    print(quicksort_new_arrays(arr1))
    print("-----")

    arr2 = [3, 6, 8, 10, 1, 2, 1]
    quicksort_in_place(arr2, 0, len(arr2) - 1)
    print(arr2)

