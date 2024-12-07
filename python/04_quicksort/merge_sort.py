def merge_sort(arr: list):
    if len(arr) <= 1:
        return arr

    # Split list in half
    mid = len(arr) // 2
    left_half = merge_sort(arr[:mid])
    right_half = merge_sort(arr[mid:])

    return merge(left_half, right_half)


def merge(left_arr: list, right_arr: list):
    merged = []
    i = j = 0

    # Compare elements from both halves and combine them
    while i < len(left_arr) and j < len(right_arr):
        if left_arr[i] < right_arr[j]:
            merged.append(left_arr[i])
            i += 1
        else:
            merged.append(right_arr[j])
            j += 1

    # Add any remaining elements in the lists
    merged.extend(left_arr[i:])
    merged.extend(right_arr[j:])
    return merged


if __name__ == "__main__":
    a = [38, 27, 43, 3, 9, 82, 10]
    sorted_a = merge_sort(a)
    print(sorted_a)
