import java.util.Stack;

class CustomNumber{
    protected int index;
    protected int number;

    public CustomNumber(int index, int number) {
        this.index = index;
        this.number = number;
    }

    @Override
    public String toString() {
        return "index: " + index + ", number: " + number;
    }
}

public class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Stack<CustomNumber> stack = new Stack<>();

        for (int i = 0; i < numbers.length; i += 1) {
            CustomNumber newNumber = new CustomNumber(i, numbers[i]);

//                스택을 돌면서 가장 위에 있는 수보다 새로들어온 수가 크다면?
//                for문을 돌면서 안에 있는 모든 수를 순회해야 한다.
//                정답 배열에 다음 큰 수를 저장
//                stack.peek().number < newNumber할동안 pop, add
                while (stack.size() > 0 && stack.peek().number < newNumber.number) {
                    answer[stack.peek().index] = newNumber.number;
                    stack.pop();
                }

            stack.push(newNumber);
        }


        for (CustomNumber number : stack) {
            answer[number.index] = -1;
        }


        return answer;
    }
}
