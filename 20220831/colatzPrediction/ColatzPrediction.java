//1-1. 입력된 수가 짝수라면 2로 나눕니다.
//1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
//2. 결과로 나온 수에 같은 작업을 1이 될 때까지 반복합니다.

public class ColatzPrediction {
    public static void main(String[] args) {
        ColatzPrediction application = new ColatzPrediction();

        System.out.println(application.solution(6));
        System.out.println(application.solution(16));
        System.out.println(application.solution(626331));
    }

    public long solution(long num) {
        long answer = 0;

        while (num != 1) {
            if (answer == 500) {
                return -1;
            }

            if (num % 2 == 0) {
                answer += 1;
                num /= 2;
                continue;
            }

            if (num % 2 != 0) {
                answer += 1;
                num *= 3;
                num += 1;
                continue;
            }
        }

        return answer;
    }
}
