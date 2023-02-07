import java.util.ArrayList;
import java.util.List;

public class NthArithmetic {
    public String toNthArithmetic(int n, int number) {
        return Integer.toString(number, n).toUpperCase();
    }

    public String getArithmeticString(int length, int n) {
        StringBuilder arithmeticString = new StringBuilder();

        for (int i = 0; arithmeticString.length() < length; i += 1) {
            arithmeticString.append(toNthArithmetic(n, i));
        }

        return arithmeticString.substring(0, length);
    }

    public List<Integer> getIndexes(int numberCount, int playerCount, int sequence) {
        List<Integer> indexes = new ArrayList<>();

        for (int i = sequence; indexes.size() < numberCount; i += playerCount) {
            indexes.add(i);
        }

        return indexes;
    }

    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();

        char[] arithmeticLetters = getArithmeticString(t * m, n).toCharArray();

        List<Integer> indexes = getIndexes(t, m, p);

        for (int index : indexes) {
            answer.append(arithmeticLetters[index - 1]);
        }

        return answer.toString();
    }
}
