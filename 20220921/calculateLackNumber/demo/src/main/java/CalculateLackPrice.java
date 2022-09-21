import java.util.ArrayList;
import java.util.List;

public class CalculateLackPrice {
    public long solution(int price, int money, int count) {
        long answer = -1;

        List<Integer> numberList = getNumberList(price, count);

        answer = numberList.stream()
                .reduce(money,
                        (a, b) -> a - b);

        if (answer > 0) {
            return 0;
        }

        return Math.abs(answer);
    }

    public List<Integer> getNumberList(int price,
                                       int count) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= count; i += 1) {
            int cost = price * i;

            numbers.add(cost);
        }
        return numbers;
    }
}
