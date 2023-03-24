import java.util.Arrays;

class Solution {
    public long solution(int[] num) {
        long answer = 0;
        Arrays.sort(num);

        for (int i = num.length - 1; i > 0 ; i--) {
            if (answer < num[i]) answer = num[i];
            answer = answer * num[i-1] / gcd(answer, num[i-1]);
        }
        return answer;
    }

    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}