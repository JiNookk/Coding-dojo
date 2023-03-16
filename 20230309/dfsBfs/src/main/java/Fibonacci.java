public class Fibonacci {
    private int[] fibo;

    public int solution(int n) {
        fibo = new int[n + 1];
        return dfs(n);
    }

    private int dfs(int n) {
        if (n == 0) {
            return fibo[n] = 0;
        }
        if (n == 1) {
            return fibo[n] = 1;
        }
        if (fibo[n] > 0) {
            return fibo[n];
        }

        return fibo[n] = dfs(n - 1) + dfs(n - 2);
    }
}
