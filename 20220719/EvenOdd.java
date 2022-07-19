public class EvenOdd {
    class Solution {
        public String solution(int num) {
            String answer = "";

            int remainder = num % 2;

            if (Math.abs(remainder) % 2 == 1){
                answer = "Odd";
            }

            if (Math.abs(remainder) % 2 == 0){
                answer = "Even";
            }

            return answer;
        }
    }
}
