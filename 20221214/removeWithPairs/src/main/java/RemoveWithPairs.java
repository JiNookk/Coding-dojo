import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveWithPairs {
    public int solution(String s) {
        String removed = removePair(s);

        return isRemoved(removed) ? 1 : 0;
    }

    public String removePair(String string) {
        Stack<Character> characters = new Stack<>();

        characters.push(string.charAt(0));

        for (int i = 1; i < string.length(); i += 1) {
            if (!characters.isEmpty() && characters.peek() == string.charAt(i)) {
                characters.pop();

                continue;
            }
            characters.push(string.charAt(i));
        }

        String removed = characters.stream()
                .map(Object::toString)
                .collect(Collectors.joining(""));

        return removed;
    }

    public boolean isRemoved(String removedString) {
        return removedString.length() == 0;
    }
}
