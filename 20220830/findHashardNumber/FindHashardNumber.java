import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution application = new Solution();

        System.out.println(application.solution(10));
        System.out.println(application.solution(12));
        System.out.println(application.solution(13));
        System.out.println(application.solution(14));
    }

    public boolean solution(int x) {
        boolean answer = true;

        String [] digits = Integer.toString(x).split("");

        int digitSum = Arrays.stream(digits)
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .sum();

        if (x % digitSum != 0) {
            answer = false;
        }

        return answer;
    }
}
