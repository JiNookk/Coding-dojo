// 어떻게 +와 -를 처리해줄까?
// 배열 [0 1 0 1]로 결정한 뒤, DFS가 마지막 노드에 도착했을때 한번에 리턴하자.

public class Solution {
    int[] sign;
    int target = 0;
    int count;

    public int solution(int[] numbers, int target) {
        sign = new int[numbers.length];
        this.target = target;
        count = 0;

        dfs(numbers, 0);

        return count;
    }

    private void dfs(int[] numbers, int level) {
        if (level == numbers.length) {
            int sum = 0;

            for (int i = 0; i < numbers.length; i += 1) {
                int number = numbers[i];

                sum += sign(i) * number;
            }

            System.out.println(sum);
            if (sum == target) {
                count += 1;
            }

            return;
        }

        sign[level] = 1;
        dfs(numbers, level + 1);
        sign[level] = 0;
        dfs(numbers, level + 1);
    }

    private int sign(int i) {
        return sign[i] == 1 ? 1 : -1;
    }
}
