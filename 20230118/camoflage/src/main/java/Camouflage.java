import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Camouflage {

    public Map<String, List<String>> categorize(String[][] clothes) {
        Map<String, List<String>> categorized = new HashMap<>();

        for (String[] cloth : clothes) {
            String clothName = cloth[0];
            String category = cloth[1];

            if (categorized.get(category) != null) {
                List<String> added = new ArrayList<>(categorized.get(category));
                added.add(clothName);

                categorized.put(category, added);
                continue;
            }

            categorized.put(category, List.of(clothName));
        }

        return categorized;
    }

    public int combination(Map<String, List<String>> categorized, int length) {
        Set<String> keys = categorized.keySet();


        // 2, 3, 4 ,1개중 n개를 골라라
        2 * 3 + 2 * 4 + 2 * 1 +
        3 * 4 + 3 * 1 +
        4 * 1

        // 4C2 * n * m

        combination(keys.size(), length) * ;



        return ;
    }

    private int combination(int size, int count) {
        return factorial(size) / factorial(size - count);
    }

    int factorial(int size) {
        int factorial = 1;

        for (int i = 0; i < size; i += 1) {
            factorial *= (i + 1);
        }

        return factorial;
    }
}
