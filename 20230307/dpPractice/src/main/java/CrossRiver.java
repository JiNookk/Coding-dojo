public class CrossRiver {
    public int solution(int stoneCount) {
        int[] dy = new int[stoneCount + 2];

        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= stoneCount + 1; i += 1) {
            dy[i] += dy[i - 1] + dy[i - 2];
        }

        return dy[stoneCount + 1];
    }
}
