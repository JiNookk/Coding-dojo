class Solution {
    public int solution(long num) {
        int answer = 0;

        for (int i = 0; i < 500; i += 1) {
            if (num == 1) {
                return answer;
            }
            if (num % 2 == 1) {
                num = 3 * num + 1;
                answer += 1;

                continue;
            }

            if (num % 2 == 0) {
                num /= 2;
                answer += 1;
            }
        }

        answer = -1;
        return answer;
    }
}
