def fibonacci(n):
    # fibonacci algo using recursion
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fibonacci(n - 1) + fibonacci(n - 2)


def fibonacci2(n, stored_values=None):
    # fibonacci algo using recursion and memoization
    if stored_values is None:
        stored_values = {}
    if n == 0:
        return 0
    elif n == 1:
        return 1

    if n not in stored_values:
        stored_values[n] = fibonacci2(n-1, stored_values) + fibonacci2(n-2, stored_values)

    return stored_values[n]


if __name__ == "__main__":
    print(fibonacci(5))
    print(fibonacci2(40))