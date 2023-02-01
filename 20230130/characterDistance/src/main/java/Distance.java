import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Distance {
    public List<Integer> toLengthArray(String word, char letter) {
        List<Integer> lengthArray = new ArrayList<>();

        List<Integer> targetIndexes = targetIndexList(word, letter);

        char[] letters = word.toCharArray();

        for (int i = 0; i < letters.length; i += 1) {
            lengthArray.add(getDistance(targetIndexes, i));
        }

        return lengthArray;
    }

    public List<Integer> targetIndexList(String word, char target) {
        List<Integer> targetIndexList = new ArrayList<>();

        char[] letters = word.toCharArray();

        for (int i = 0; i < letters.length; i += 1) {
            if (letters[i] == target) {
                targetIndexList.add(i);
            }
        }

        return targetIndexList;
    }

    public int getDistance(List<Integer> targetIndexes, int index) {
        return targetIndexes.stream()
                .map(target -> Math.abs(target - index))
                .min((a, b) -> a - b)
                .get();
    }

    public static void main(String[] args) {
        Distance distance = new Distance();

        Scanner in = new Scanner(System.in);

        String word = in.next();
        char letter = in.next().charAt(0);

        List<Integer> lengthArray = distance.toLengthArray(word, letter);

        for (int length : lengthArray) {
            System.out.print(length);
        }

        return;
    }
}
