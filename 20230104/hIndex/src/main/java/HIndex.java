import java.util.Arrays;
import java.util.Comparator;

public class HIndex {
    public int[] sort(int[] citations) {
        Comparator<Integer> comparator = (a, b) -> b - a;

        return Arrays.stream(citations)
                .boxed()
                .sorted(comparator)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public boolean isHIndex(int[] sorted, int count) {
        if (count > sorted.length) {
            return false;
        }

        return sorted[count - 1] >= count;
    }

    public int solution(int[] citations) {
        int answer = 0;

        int[] sorted = sort(citations);

        for (int i = 1; isHIndex(sorted, i); i += 1) {
            answer = i;
            System.out.println(answer);
        }

        return answer;
    }
}
