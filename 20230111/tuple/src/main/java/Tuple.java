import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Tuple {
    public int[] solution(String s) {
        List<String> strings = toElement(s);

        return store(strings).stream().mapToInt(Integer::intValue).toArray();
    }


    public List<String> toElement(String tuple) {
        return Arrays.stream(tuple.substring(2, tuple.length() - 2)
                        .split("},[{]"))
                .collect(Collectors.toList());
    }

    public List<String> sort(List<String> strings) {
        return strings.stream()
                .sorted((a,b) -> a.length() - b.length())
                .toList();
    }

    public Set<Integer> store(List<String> strings) {
        Set<Integer> stored = new LinkedHashSet<>();

        List<String> sorted = sort(strings);


        for (String elem : sorted) {
            String[] numbers = elem.split(",");

            // 일단 문자열로 저장했다가 한번에 숫자로 바꿨어도 됬겠누
            for (String number : numbers) {
                stored.add(Integer.parseInt(number));
            }
        }

        return stored;
    }
}
