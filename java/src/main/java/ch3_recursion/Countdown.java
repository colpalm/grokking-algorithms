package ch3_recursion;

public class Countdown {
    public static void main(String[] args) {
        countdown(10);
    }

    public static void countdown(int n) {
        System.out.println(n);
        if (n <= 1) return;
        countdown(n-1);
    }
}
