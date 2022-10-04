import java.util.Arrays;

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(solution(123));
        System.out.println(solution(987));
    }

    public static int solution(int n) {
        int answer = Arrays.stream(Integer.toString(n).split(""))
                .map(Integer::parseInt)
                .reduce(Integer::sum).get();
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
