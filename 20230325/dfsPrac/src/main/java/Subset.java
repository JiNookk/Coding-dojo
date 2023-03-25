public class Subset {
    static int n;
    static int[] ch;

    public void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";

            for (int i = 1; i <= n; i += 1) {
                // 만약 배열에 특정 원소를 사용하기로 했다면 -> 문자열에 더한다.
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }

            // 만약 공집합이라면 거른다. -> 8개의 경우의 수 중 하나도 안쓰는 경우 1개 제외
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }

            return;
        }

//        [0, 0, 0, 0] -> DFS(1)
//        [0, 1, 0, 0] -> DFS(2)
//        [0, 1, 1, 0] -> DFS(3)
//        [0, 1, 1, 1] -> DFS(4)
        // 재귀 -> 분기점을 만들어준다.

        ch[L] = 1;
        DFS(L + 1);
        ch[L] = 0;
        DFS(L + 1);
    }

    public static void main(String[] args) {
        Subset subset = new Subset();

        n = 3;
        ch = new int[n + 1];

        subset.DFS(1);
    }
}
