import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescendOrder {
    public static void main(String[] args) {
        SortDescendOrder application = new SortDescendOrder();
        application.run();
    }

    private void run() {
        System.out.println(solution("Zbcdefg"));
    }

    public String solution(String s) {
        String answer = "";

        List<String> stringList = Arrays.asList(s.split(""));

        answer = stringList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(","));

        return answer;
    }
}
