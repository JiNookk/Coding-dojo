public class NumberToArray {
    public long[] solution(long n) {
        String[] digits = Long.toString(n).split("");

        long[] answer = new long[digits.length];
        // digits => 0~n까지

        // n ~ 0까지
        for (int i = 0; i < digits.length; i+=1) {
            answer[i] = Long.parseLong(digits[digits.length-1-i]);
        }
        return answer;
    }
}
