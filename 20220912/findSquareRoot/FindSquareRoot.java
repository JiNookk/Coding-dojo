public class FindSquareRoot {
    public static void main(String[] args) {
        FindSquareRoot application = new FindSquareRoot();
        System.out.println(application.solution(121));
        System.out.println(application.solution(3));
    }

    public long solution(long n) {
        long answer = 0;

        double squareRoot = Math.sqrt(n);
        if (squareRoot % 1 == 0) {

            answer = (long) Math.pow(squareRoot + 1, 2);
            return answer;
        }

        answer = -1;
        return answer;
    }
}
