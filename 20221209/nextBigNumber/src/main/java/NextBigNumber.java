public class NextBigNumber {
    public String toBinaryString(int number) {
        return Integer.toBinaryString(number);
    }

    public int solution(int n) {
        String binary = toBinaryString(n);

        int count = count(binary);

        int nextNumber = n + 1;

        while (count != count(toBinaryString(nextNumber))) {
            nextNumber += 1;
        }

        return nextNumber;
    }

    public int count(String binary) {
        int count = 0;

        char[] chars = binary.toCharArray();

        for (char character : chars) {
            if (character == '1') {
                count += 1;
            }
        }

        return count;
    }
}
