import java.util.ArrayList;
import java.util.List;

public class HateSameNumber {
    public static void main(String[] args) {
        HateSameNumber application = new HateSameNumber();
        application.run();
    }

    private void run() {

    }

    public int[] solution(int[] arr) {
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        List<Integer> noDupicated = new ArrayList<>();

        for (int elem : arr) {
            if (noDupicated.size() == 0) {
                noDupicated.add(elem);
            }

            int lastElem = noDupicated.get(noDupicated.size() - 1);

            if (elem != lastElem) {
                noDupicated.add(elem);
            }
        }

        return noDupicated.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
