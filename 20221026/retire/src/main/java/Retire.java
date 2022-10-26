import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Retire {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 맞출수 있는 개수구하기 -> switch문으로 구하기
        // 0개수 빼고 진행해야겠지? -> 0 빼고 존재하는 숫자만큼 카운트 증가시키기
        List<Boolean> isCorrect = Arrays.stream(lottos)
                .sorted()
                .filter(lotto -> lotto != 0)
                .mapToObj(lotto -> Arrays.stream(win_nums).anyMatch((num) -> lotto == num))
                .collect(Collectors.toList());

        int minCount = isCorrect.stream().filter(count -> count)
                .collect(Collectors.toList()).size();

        //정답 갯수 구하기
        int maxCount = minCount + (6 - isCorrect.size());

        return new int[]{nthPlace(maxCount), nthPlace(minCount)};
    }

    private int nthPlace(int count) {
        return switch (count) {
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
    }
}
