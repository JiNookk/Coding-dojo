class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i += 1) {
            boolean primeNumber = true;

            for (int j = 2; j * j <= i; j += 1) {
                if (i % j == 0) {
                    primeNumber =false;
                    break;
                }
            }
            if (primeNumber == false) {
                continue;
            }
            answer += 1;
        }
        return answer;
    }
}
