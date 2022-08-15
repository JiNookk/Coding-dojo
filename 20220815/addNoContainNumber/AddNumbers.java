class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        for (int i = 0; i<10; i +=1 ){
            answer += i;
        }

        for (int number : numbers){
            answer -= number;
        }

        return answer;
    }
}
