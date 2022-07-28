class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};

        long[] array = new long[n];

        long increment = 0;

        for(int i = 0; i < n; i += 1){
            increment +=x;
            array[i] = increment;
        }

        answer = array;

        return answer;
    }
}
