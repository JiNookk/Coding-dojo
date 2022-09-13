import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindMrKim {
    public static void main(String[] args) {
        FindMrKim application = new FindMrKim();
        application.run();
    }

    private void run() {
        String[] seoul = new String[]{"Bae","Oh","Kim"};

        System.out.println(solution(seoul));
    }

    public String solution(String[] seoul) {
        String answer = "";

        List<String> nameList = Arrays.stream(seoul).collect(Collectors.toList());

        int index = nameList.indexOf("Kim");

        answer = "김서방은 " + index + "에 있다";

        return answer;
    }
}
