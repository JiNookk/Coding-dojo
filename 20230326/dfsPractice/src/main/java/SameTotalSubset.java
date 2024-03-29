import java.util.Scanner;

public class SameTotalSubset {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if (flag) {
            return;
        }
        if (L == n) {
            if ((total - sum) == sum) {
                answer = "YES";
                flag = true;
            }

            return;
        }

        DFS(L + 1, sum + arr[L], arr);
        DFS(L + 1, sum, arr);
    }

    public static void main(String[] args) {
        SameTotalSubset subset = new SameTotalSubset();

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i += 1) {
            arr[i] = scanner.nextInt();
            total += arr[i];
        }

        subset.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
