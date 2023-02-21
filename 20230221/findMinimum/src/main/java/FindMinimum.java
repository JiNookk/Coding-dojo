import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class FindMinimum {
    public int dotProduct(int[] arr1, int[] arr2) {
        int dotProduct = 0;

        for (int i = 0; i < arr1.length; i += 1) {
            dotProduct += arr1[i] * arr2[arr1.length - i - 1];
        }

        return dotProduct;
    }

    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = dotProduct(A, B);

        return answer;
    }
}
