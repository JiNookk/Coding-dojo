import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FruitSeller {
    public int getMaxProfit(int boxSize, int[] grades) {
        int profit = 0;

        List<Box> boxes = packageFruits(boxSize, grades);

        for (Box box : boxes) {
            profit += box.calculateProfit();
        }

        return profit;
    }

    private List<Box> packageFruits(int boxSize, int[] grades) {
        List<Box> boxes = new ArrayList<>();

        List<Integer> gradeList = Arrays.stream(grades)
                .boxed()
                .sorted((a, b) -> (b - a))
                .collect(Collectors.toList());

        for (int i = boxSize; i <= grades.length; i += boxSize) {
            Box box = new FruitBox(gradeList.subList(i - boxSize, i));
            boxes.add(box);
        }

        return boxes;
    }
}
