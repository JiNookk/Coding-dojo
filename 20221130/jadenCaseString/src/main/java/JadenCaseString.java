import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCaseString {
    public String changeWordCase(String word) {
        if (word.equals("")) {
            return "";
        }

        String firstLetter = word.split("")[0];
        String otherLetters = word.substring(1);

        return String.join("", firstLetter.toUpperCase(), otherLetters.toLowerCase());
    }

    public String solution(String sentence) {
        String[] words = sentence.split(" ",-1);

        return Arrays.stream(words)
                .map(this::changeWordCase)
                .collect(Collectors.joining(" "));
    }
}
