public class Factorial {
    public int solution(int n) {
        return dfs(n);
//        return dfs(n, 1);
    }

    private int dfs(int n) {
        if (n == 1) {
            return 1;
        }

        return n * dfs(n - 1);
    }

//    private int dfs(int n, int multiplier) {
//        if (n == 0) {
//            return multiplier;
//        }
//
//        multiplier *= n;
//
//        return dfs(n - 1, multiplier);
//    }
}
