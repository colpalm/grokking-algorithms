def sum_array(arr, index=0):
    if len(arr) == 0:
        return 0
    elif index == len(arr) - 1:
        return arr[index]
    else:
        return arr[index] + sum_array(arr, index + 1)


if __name__ == "__main__":
    print(sum_array([4, 5, 10]))
