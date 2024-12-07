class BinarySearch:

    def binary_search(self, arr, item):
        # low and high keep track of which part of the list you'll search in.
        low = 0
        high = len(arr) - 1

        while low <= high:
            mid = (high + low) // 2 # integer (floor) division - rounds down
            guess = arr[mid]

            if guess == item:
                return mid
            elif guess > item:
                high = mid - 1
            else:
                low = mid + 1

        # If item does not exist
        return None

if __name__ == "__main__":
    bs = BinarySearch()
    my_list = [1, 3, 5, 7, 9]

    print(bs.binary_search(my_list, 3)) # => 1
    # 'None' means nil in Python. We use to indicate that the item wasn't found.
    print(bs.binary_search(my_list, -1)) # => None
