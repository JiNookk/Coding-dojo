import java.util.stream.IntStream;

public class FindRemainderOne {
    public static void main(String[] args) {
        FindRemainderOne application = new FindRemainderOne();
        application.run();
    }

    private void run() {

    }

    public int solution(int n) {
        return IntStream.range(1, n)
                .filter(elem -> n % elem == 1)
                .findFirst().getAsInt();
    }
}
