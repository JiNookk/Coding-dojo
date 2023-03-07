import java.util.Map;
import java.util.Stack;

public class RotateBracket {
    public int solution(String s) {
        int answer = 0;

        for (int i = 0; i < s.length(); i += 1) {
            answer += validate(s) ? 1 : 0;
            s = rotate(s);
        }

        return answer;
    }

    public boolean validate(String brackets) {
        Stack<Character> stack = new Stack<>();

        for (char bracket : brackets.toCharArray()) {

            if (!stack.isEmpty() && pairs(stack.peek(), bracket)) {
                stack.pop();
                continue;
            }

            stack.push(bracket);
        }

        return stack.isEmpty();
    }

    private boolean pairs(Character peek, Character bracket) {
        Map<Character, Integer> table = Map.of('[', 1, ']', -1, '{', 2, '}', -2, '(', 3, ')', -3);

        if (table.get(peek) < 0) {
            return false;
        }

        return table.get(peek) + table.get(bracket) == 0;
    }

    public String rotate(String brackets) {
        String firstLetter = brackets.substring(0, 1);

        return brackets.substring(1) + firstLetter;
    }
}
