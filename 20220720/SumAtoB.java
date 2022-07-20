class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        int numberElement = Math.abs(a -b ) + 1;

        answer = numberElement*(a + b)/2;

        return answer;
    }
}