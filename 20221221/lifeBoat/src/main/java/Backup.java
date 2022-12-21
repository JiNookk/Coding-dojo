import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Backup {
    public List<Integer> toList(int[] people) {
        List<Integer> weights = new ArrayList<>();

        for (int weight : people) {
            weights.add(weight);
        }

        return weights;
    }

    public List<Integer> remains(int limit, List<Integer> toBeRescued) {
        int min = Collections.min(toBeRescued);

        while ((limit - min) >= 0) {
            limit -= min;
            toBeRescued.remove((Integer) min);

            if (toBeRescued.size() > 0) {
                min = Collections.min(toBeRescued);
            }
        }

        return toBeRescued;
    }

    public int required(int limit, List<Integer> weights) {
        int count = 0;

        while (weights.size() != 0) {
            weights = remains(limit, weights);
            count += 1;
        }

        return count;
    }

    public int solution(int[] people, int limit) {
        List<Integer> weights = toList(people);

        return required(limit, weights);
    }
}
