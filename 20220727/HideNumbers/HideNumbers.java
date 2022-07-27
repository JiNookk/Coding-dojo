class Solution {
    public String solution(String phone_number) {
        String answer = "";

        char[] numbers = phone_number.toCharArray();

        for(int i = 0; i < numbers.length-4; i += 1){
            answer += "*";
        }

        answer += phone_number.substring(numbers.length-4);

        return answer;
    }
}
