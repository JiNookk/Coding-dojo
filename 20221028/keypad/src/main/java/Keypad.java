public class Keypad {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        Hand leftHand = new Hand("left");
        Hand rightHand = new Hand("right");

        for (int number : numbers) {
            answer += pressButton(number, leftHand, rightHand, hand);
        }

        return answer;
    }

    public String pressButton(int number, Hand leftHand, Hand rightHand, String hand) {
        if (number == 0) {
            number = 11;
        }

        if (number % 3 == 1 || leftHand.distance(number) < rightHand.distance(number)) {
            leftHand.press(number);
            return "L";
        }

        if (number % 3 == 0 || leftHand.distance(number) > rightHand.distance(number)) {
            rightHand.press(number);
            return "R";
        }

        if (hand.equals("left")) {
            leftHand.press(number);
            return "L";
        }

        rightHand.press(number);
        return "R";
    }
}
