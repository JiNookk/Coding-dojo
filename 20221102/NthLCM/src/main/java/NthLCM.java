import java.util.Arrays;

public class NthLCM {
    public int solution(int[] arr) {
        int answer = 0;

        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();

        int lcm = max * min;

        boolean isLCM = false;

        isLCM = isLcM(arr, max);

        answer = isLCM ? max : 0;

        while (!isLCM){
            isLCM = isLcM(arr, lcm);

            answer = isLCM ? lcm : 0;

            lcm += 1;
        }
        return answer;
    }

    private boolean isLcM(int[] arr, int lcm) {
        for (int number : arr) {
            if (lcm % number != 0){
                return false;
            }
        }
        return true;
    }
}
