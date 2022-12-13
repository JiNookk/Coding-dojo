public class Carpet {

    public int[] findYellowRectangleSize(int brownCount, int yellowCount) {
        int m = 1;
        int n = 1;

        for (int i = n; i < brownCount / 2; i += 1) {
            m = 1;
            for (int j = m; j < brownCount / 2; j += 1) {
                if (isRoot(brownCount, yellowCount, m, n)) {
                    return new int[]{m + 2, n + 2};
                }
                m += 1;
            }
            n += 1;
        }

        return new int[]{m + 2, n + 2};
    }

    public boolean isRoot(int brownCount, int yellowCount, int m, int n) {
        return isYellowCount(yellowCount, m, n) && isBrownCount(brownCount, m, n);
    }

    public boolean isBrownCount(int brownCount, int m, int n) {
        return (2 * n + 2 * m + 4) == brownCount;
    }

    public boolean isYellowCount(int yellowCount, int m, int n) {
        return m * n == yellowCount;
    }
}
