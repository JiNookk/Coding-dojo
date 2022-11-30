import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCaseString {
    public String firstLetterToUpperCase(String word) {
        if (word.equals("")) {
            return "";
        }

        String firstLetter = word.split("")[0];
        String otherLetters = word.substring(1);

        return String.join("", firstLetter.toUpperCase(), otherLetters);
    }

    public String otherLettersToLowerCase(String word) {
        if (word.equals("")) {
            return "";
        }

        String firstLetter = word.split("")[0];
        String otherLetters = word.substring(1);

        return String.join("", firstLetter, otherLetters.toLowerCase());
    }

    public String solution(String sentence) {
        String[] words = sentence.split(" ",-1);

        return Arrays.stream(words)
                .map(this::firstLetterToUpperCase)
                .map(this::otherLettersToLowerCase)
                .collect(Collectors.joining(" "));
    }
}
