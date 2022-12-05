import java.util.Arrays;
import java.util.stream.Collectors;

public class BinaryNumberRepetition {
    public String binaryWithoutZero(String binary) {
        return Arrays.stream(binary.split(""))
                .map(Integer::parseInt)
                .filter(digit -> digit == 1)
                .map(digit -> Integer.toString(digit))
                .collect(Collectors.joining());
    }

    public String lengthToBinary(int binaryLength) {
        return Integer.toBinaryString(binaryLength);
    }

    public int eraseCount(String initial, String comparison) {
        return initial.length() - comparison.length();
    }

    public int[] solution(String binaryString) {
        int convertCount = 0;
        int eraseCount = 0;

        while (!binaryString.equals("1")) {
            String erased = binaryWithoutZero(binaryString);

            eraseCount += eraseCount(binaryString, erased);
            convertCount += 1;

            binaryString = lengthToBinary(erased.length());
        }

        return new int[]{convertCount, eraseCount};
    }
}
