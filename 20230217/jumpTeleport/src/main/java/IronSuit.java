public class IronSuit {
    private int target;
    private int batteryUsage = 0;
    private int distance = 0;

    public IronSuit(int target) {
        this.target = target;
    }

    public int target() {
        return target;
    }

    public int distance() {
        return distance;
    }

    public int batteryUsage() {
        return batteryUsage;
    }

    public IronSuit jump(int jumpDistance) {
        distance += jumpDistance;
        batteryUsage += jumpDistance;

        return this;
    }

    public IronSuit teleport() {
        distance *= 2;

        return this;
    }
}
