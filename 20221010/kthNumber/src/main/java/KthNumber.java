import java.util.Arrays;

public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i += 1) {
            int k = commands[i][2];

            int[] arr = sliceAndSortArray(array, commands[i]);

            answer[i] = getKthNumber(arr,k);
        }

        return answer;
    }

    public int getKthNumber(int[] arr, int k) {
        return arr[k-1];
    }

    public int[] sliceAndSortArray(int[] array, int[] slice) {
        int length = slice[1] - slice[0] + 1;
        int[] sliced = new int[length];

        for (int i = 0; i < length; i += 1) {
            sliced[i] = array[i + slice[0] - 1];
        }

        return Arrays.stream(sliced).sorted().toArray();
    }
}
