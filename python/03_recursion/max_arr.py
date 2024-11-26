def max_arr(arr, index=0):
    # Find max value in array recursively
    if index == len(arr) - 1:
        return arr[index]

    max_of_rest = max_arr(arr, index+1)
    return arr[index] if arr[index] > max_of_rest else max_of_rest

if __name__ == "__main__":
    print(max_arr([5,40,3,2,100,80,11]))