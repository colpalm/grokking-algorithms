def arr_length(arr, index=0):
    # return length of list recursively
    try:
        temp = arr[index]
        return arr_length(arr, index + 1)
    except IndexError:
        return index


if __name__ == "__main__":
    print(arr_length([5, 4, 3, 2, 10, 80, 11]))
