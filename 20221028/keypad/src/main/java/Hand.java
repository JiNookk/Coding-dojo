public class Hand {
    private final String hand;
    private Integer lastPosition;

    public Hand(String hand) {
        this.hand = hand;

        this.lastPosition = this.hand.equals("left") ? 10 : 12;
    }

    public int distance(int target) {
        if (target == 0) {
            target = 11;
        }

        if (lastPosition % 3 == 1) {
            return target > lastPosition
                    ? Math.abs(target - lastPosition) / 3 + 1
                    : Math.abs(target - lastPosition) / 3 + 2;
        }

        if (lastPosition % 3 == 0) {
            return target > lastPosition
                    ? Math.abs(target - lastPosition) / 3 + 2
                    : Math.abs(target - lastPosition) / 3 + 1;
        }

        return Math.abs(target - lastPosition) / 3;
    }

    public int press(int number) {
        this.lastPosition = number;
        return number;
    }
}
