import java.util.Arrays;

public class FindMinMax {
    public int[] getLetters(String string) {
        return Arrays.stream(string.split(" "))
                .map(Integer::parseInt)
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public String getMinMax(int[] letters) {
        int max = Arrays.stream(letters).max().getAsInt();
        int min = Arrays.stream(letters).min().getAsInt();

        return min + " " + max;
    }

    public String minMax(String string) {
        int[] letters = getLetters(string);

        return getMinMax(letters);
    }
}
