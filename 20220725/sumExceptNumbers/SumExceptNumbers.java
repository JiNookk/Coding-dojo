class Solution {
    public int solution(int[] numbers) {

        int[] zeroToNine = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int sum = 0;

        for (int num : zeroToNine) {
            sum += num;
        }

        int answer = 0;

        for (int num2 : numbers) {
            if (num2 > 0 && num2 < 10)
                sum -= num2;
        }

        answer = sum;

        return answer;
    }
}