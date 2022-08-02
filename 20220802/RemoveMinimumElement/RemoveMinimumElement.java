import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int min = arr[0];

        if(arr.length == 1)
        {
            answer = new int[]{-1};
            return answer;
        }

        for (int elem : arr) {
            if (min > elem) {
                min = elem;
            }
        }

        List<Integer> arrayList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int index = arrayList.indexOf(min);

        arrayList.remove(index);

        arr = arrayList.stream().mapToInt(Integer::intValue).toArray();

        answer = arr;

        return answer;
    }
}
