class Solution {
    public double solution(int[] arr) {
        double answer = 0;

        for (double elem:arr){
            answer += elem;
        }

        answer /= arr.length;

        return answer;
    }
}
