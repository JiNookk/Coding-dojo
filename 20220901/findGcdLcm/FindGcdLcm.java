public class FindGcdLcm {
    public static void main(String[] args) {
        FindGcdLcm application = new FindGcdLcm();
        System.out.println(application.solution(3, 12)[0]);      //[3,12]
        System.out.println(application.solution(3, 12)[1]);
        System.out.println(application.solution(2, 5)[0]);       //[1,10]
        System.out.println(application.solution(2, 5)[1]);
    }

    private int [] solution(int n, int m) {
        int[] answer = new int[2];

        answer[0] = findGcd(n,m);

        answer[1] = findLcm(n,m);

        return answer;
    }

    private int findGcd(int n, int m) {
        int min = Math.min(n, m);

        for (int i = min; i > 0; i -= 1) {
            if (n % i == 0 && m % i == 0) {
                return i;
            }
        }

        return 0;
    }

    private int findLcm(int n, int m) {
        int max = Math.max(n, m);

        for (int i = max; i <= n * m; i += 1) {
            if (i % n == 0 && i % m == 0) {
                return i;
            }
        }

        return 0;
    }
}
