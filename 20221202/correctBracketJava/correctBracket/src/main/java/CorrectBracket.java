public class CorrectBracket {
    public boolean solution(String string) {
        if (string.length() % 2 == 1 || string.charAt(0) == ')') {
            return false;
        }

        int startBracketCount = 0;
        int endBracketCount = 0;

        for (int i = 0; i < string.length(); i += 1) {
            char bracket = string.charAt(i);
            if (bracket == '(') {
                startBracketCount += 1;
                continue;
            }

            endBracketCount += 1;

            if (endBracketCount > startBracketCount) {
                return false;
            }
        }

        return startBracketCount == endBracketCount;
    }
}
