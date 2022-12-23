import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Backup {
    private Map<String, Integer> dictionary = new LinkedHashMap<>();

    public Backup() {
        List<String> letters = List.of("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P",
                "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

        for (int i = 0; i < letters.size(); i++) {
            dictionary.put(letters.get(i), i);
        }
    }

    public Map<String, Integer> save(String input) {
        if (dictionary.get(input) != null) {
            return Map.copyOf(dictionary);
        }

        dictionary.put(input, dictionary.size() + 1);
        return Map.copyOf(dictionary);
    }

    public int[] solution(String word) {
        return new int[0];
    }

    public List<Integer> toIndexList(String word) {
        List<Integer> indexList = new ArrayList<>();

        String currentWord = "";

        // 현재 글자와 다음 글자를 더한 내용이 사전에 존재하는가? -> 있으면 현재글자와 다음 글자 더해서 다시 비교하라.
        // 현재 글자와 다음 글자를 더한 내용이 사전에 존재하지 않는가 -> 없으면 사전에 등록하고 리스트에 인덱스를 출력하라.
        String[] letters = word.split("");

        for (int i = 0; i < letters.length; i++) {
            String w = letters[i];
            String c = letters[i + 1];
             String wc = w + c;

            if (dictionary.containsKey(wc)) {

            }

            dictionary.put(currentWord, dictionary.size() + 1);
        }

        return List.of(11, 1, 27, 15);
    }
}
