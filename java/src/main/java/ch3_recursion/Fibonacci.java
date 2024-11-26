package ch3_recursion;

import java.util.HashMap;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }

    public static long fibonacci(int n) {
        return fibonacci(n, new HashMap<>());
    }

    private static long fibonacci(int n, HashMap<Integer, Long> map) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (map.containsKey(n)) return map.get(n);

        long result = fibonacci(n-1, map) + fibonacci(n-2, map);
        map.put(n, result);

        return result;
    }
}
