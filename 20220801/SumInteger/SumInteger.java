class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;

        int sum = 0;

        for (int i = 0 ; i < signs.length; i += 1){
            if (signs[i] == false){
                absolutes[i] *= -1;
            }
        }

        for (int absolute : absolutes){
            sum += absolute;
        }

        answer = sum;
        return answer;
    }
}
