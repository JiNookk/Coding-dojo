import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LongestWord {
    public int length(String word) {
        return word.length();
    }

    public int findMax(List<Integer> lengthList) {
        int index = 0;

        for (int length : lengthList) {
            if (length > lengthList.get(index)) {
                index = lengthList.indexOf(length);
            }
        }

        return index;
    }

    public String solution(String sentence) {
        String[] words = sentence.split(" ");

        List<Integer> lengthList = Arrays.stream(words)
                .map(String::length)
                .collect(Collectors.toList());

        int index = findMax(lengthList);

        return words[index];
    }

    public static void main(String[] args) {
        LongestWord longestWord = new LongestWord();

        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();

        System.out.println(longestWord.solution(sentence));
        return;
    }
}
