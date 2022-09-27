import java.util.Arrays;

class Budget {
    public int solution(int[] d, int budget) {
        int answer = 0;

        int count = 0;

        // 작은순으로 배열을 정렬한다.
        sort(d);

        // 정렬한 뒤 예산에서 빼주고 카운트를 1씩 증가
        for (int elem : d) {
            if (budget >= elem) {
                budget -= elem;
                answer += 1;
            }
        };

        return answer;
    }

    public void sort(int[] arr) {
        Arrays.sort(arr);
    }
}