class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int forLength = Math.abs(a - b);

        if (forLength == 0) {
            return a;
        }

        for (int i = 0; i <= forLength; i += 1) {
            answer += a;

            if (a < b) {
                a += 1;
                continue;
            }

            a -= 1;
        }

        return answer;
    }
}
