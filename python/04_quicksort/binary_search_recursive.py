def binary_search_recursive(arr, target, low, high):
    if low > high or low == len(arr):
        return None

    mid = (low + high) // 2
    if arr[mid] == target:
        return mid
    elif arr[mid] > target:
        high = mid - 1
    else:
        low = mid + 1
    return binary_search_recursive(arr, target, low, high)


if __name__ == "__main__":
    my_list = [1, 3, 5, 7, 9, 11]
    print(binary_search_recursive(my_list, 0, 0, len(my_list)))
