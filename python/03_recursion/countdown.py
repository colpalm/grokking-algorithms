def countdown(n):
    # countdown from n
    print(n)
    if n <= 1:
        return
    else:
        countdown(n-1)

if __name__ == "__main__":
    countdown(5)