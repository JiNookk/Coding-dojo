class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int min = Math.min(a,b);
        int max = Math.max(a,b);

        int forLength = max-min;

        for (int i = 0; i <= forLength; i += 1){
            answer += min;

            min += 1;
        }

        return answer;
    }
}