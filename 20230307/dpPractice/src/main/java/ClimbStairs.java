public class ClimbStairs {
    public int solution(int stairCount) {
        int[] dy = new int[stairCount + 1];
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= stairCount; i += 1) {
            dy[i] += dy[i - 1] + dy[i - 2];
        }

        return dy[stairCount];
    }
}
