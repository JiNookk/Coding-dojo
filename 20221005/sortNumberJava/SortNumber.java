import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortNumber {
    public static void main(String[] args) {
//        solution(118372);
        System.out.println(solution(118372));
    }
    public static long solution(long n) {
        return Long.parseLong(Arrays.stream(Long.toString(n).split(""))
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.joining()));
    }
}
