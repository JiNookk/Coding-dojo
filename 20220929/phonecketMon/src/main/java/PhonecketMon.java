import java.util.Arrays;
import java.util.stream.Collectors;

public class PhonecketMon {
    public int solution(int[] nums) {
        int answer = 0;

        answer = Arrays.stream(nums).
                boxed().collect(Collectors.toSet())
                .size();

        if (answer > nums.length / 2) {
            return nums.length / 2;
        }

       return answer;
    }
}
