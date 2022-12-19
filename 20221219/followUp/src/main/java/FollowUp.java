import java.util.LinkedHashMap;
import java.util.Map;

public class FollowUp {
    public boolean validateWordLength(String string) {
        return string.length() > 1;
    }

    public boolean validateFirstLetter(String previousWord, String nextWord) {
        if (nextWord.length() == 0 || previousWord.length() == 0) {
            return false;
        }

        return previousWord.substring(previousWord.length() - 1).equals(nextWord.substring(0, 1));
    }

    public int validate(String[] strings) {
        Map<String, Integer> storage = new LinkedHashMap<>();

        for (int i = 0; i < strings.length; i += 1) {
            if (!validateWordLength(strings[i])) {
                return i;
            }
            if (i > 0 && !validateFirstLetter(strings[i - 1], strings[i])) {
                return i;
            }
            if (storage.get(strings[i]) == null) {
                storage.put(strings[i], i);
                continue;
            }
            return i;
        }

        return 0;
    }

    public int[] getDropout(int playerCount, int dropoutIndex) {
        if (dropoutIndex == 0) {
            return new int[]{0, 0};
        }

        int playerNumber = (dropoutIndex + 1) % playerCount;
        int cycle = (dropoutIndex + 1) / playerCount + 1;

        return new int[]{playerNumber == 0 ? playerCount : playerNumber, playerNumber == 0 ? cycle - 1 : cycle};
    }

    public int[] solution(int n, String[] words) {
        int dropoutIndex = validate(words);

        return getDropout(n, dropoutIndex);
    }
}
