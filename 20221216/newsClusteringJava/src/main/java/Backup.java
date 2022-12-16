import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class Backup {
    public List<String> toMultipleSet(String string) {
        List<String> elements = new ArrayList<>();

        string = string.toLowerCase();

        char[] letters = string.toCharArray();

        for (int i = 0; i < letters.length - 1; i += 1) {
            String element = String.valueOf(letters[i]) + letters[i + 1];

            if (Pattern.matches("^[a-zA-Z]*$", element)) {
                elements.add(element);
            }
        }

        return elements;
    }

    public Set<String> intersection(Set<String> set1, Set<String> set2) {
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        return intersection;
    }

    public List<String> union(List<String> set1, List<String> set2) {
        // 합집합: [aa, aa, aa], [aa, aa] => [aa,aa,aa]
        List<String> union = new ArrayList<>();

        set1 = set1.stream().sorted().toList();
        set2 = set2.stream().sorted().toList();

        union.addAll(set1);
        union.addAll(set2);

        return union;
    }

    public int jaccardSimilarity(int intersectionLength, int unionLength) {
        return intersectionLength * 65536 / unionLength;
    }

    public int solution(String str1, String str2) {
        List<String> multipleSet1 = toMultipleSet(str1);
        List<String> multipleSet2 = toMultipleSet(str2);

//        List<String> union = union(multipleSet1, multipleSet2);
//        List<String> intersection = intersection(multipleSet1, multipleSet2);

//        int answer = jaccardSimilarity(intersection.size(), union.size());

//        return answer;
        return 0;
    }
}
