import java.util.List;

public class FruitBox implements Box {
    private List<Integer> grades;

    public FruitBox(List<Integer> grades) {
        this.grades = grades;
        System.out.println(grades);
    }

    @Override
    public int calculateProfit() {
        return grades.size() * grades.stream().mapToInt(Integer::intValue).min().getAsInt();
    }
}
