import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainingBook {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        Map<Integer, Integer> trainingBook = new LinkedHashMap<>();

        List<Integer> reserved = getIntegers(reserve, lost);

        List<Integer> losted = getIntegers(lost, reserve);

        for (int i = 0; i < n; i += 1) {
            if (reserved.contains(i + 1)) {
                trainingBook.put(i + 1, 2);
                continue;
            }

            if (losted.contains(i + 1)) {
                trainingBook.put(i + 1, 0);
                continue;
            }

            trainingBook.put(i + 1, 1);
        }

        for (int person : reserved) {
            if (person != 1 && trainingBook.get(person - 1) == 0) {
                trainingBook.replace(person - 1, 1);
                trainingBook.replace(person, 1);
                continue;
            }

            if (person != n && trainingBook.get(person + 1) == 0) {
                trainingBook.replace(person + 1, 1);
                trainingBook.replace(person, 1);
            }
        }

        for (int number : trainingBook.values()) {
            if (number != 0) {
                answer += 1;
            }
        }

        return answer;
    }

    public List<Integer> getIntegers(int[] lost, int[] reserve) {
        List<Integer> losted =
                Arrays.stream(lost)
                .filter(one -> Arrays.stream(reserve).noneMatch(r -> r == one))
                .boxed().collect(Collectors.toList());
        return losted;
    }
}
