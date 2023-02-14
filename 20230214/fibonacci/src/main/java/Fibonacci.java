public class Fibonacci {
    public int solution(int n) {
        return (int) fibonacciNumber(n);
    }

    public long fibonacciNumber(int n) {
        if (n < 2) {
            return n;
        }

        int fibonacci = 0;
        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i += 1) {
            fibonacci = (a + b) % 1234567;
            a = b;
            b = fibonacci;
        }

        return fibonacci;
    }
}
