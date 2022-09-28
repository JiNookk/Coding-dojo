public class AddCommonNumber {
    public int solution(int left, int right) {
        int answer = 0;

        //약수가 짝수이면 answer에 더하고 홀수이면 answer에서 빼기
        for (int i = left; i <= right; i += 1) {
            //각각의 약수 개수 찾기
            int commonNumberCount = commonNumberCount(i);

            if (commonNumberCount % 2 == 0) {
                answer += i;
                continue;
            }

            answer -= i;
        }

        return answer;
    }

    public int commonNumberCount(int number) {
        int count = 0;

        for (int i = 1; i <= number; i += 1) {
            if (number % i == 0) {
                count += 1;
            }
        }

        return count;
    }
}
