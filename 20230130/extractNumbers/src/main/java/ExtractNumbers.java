import java.util.Scanner;

public class ExtractNumbers {
    public boolean isNumeric(char letter) {
        return Character.isDigit(letter);
    }

    public int getNumber(String word) {
        StringBuilder number = new StringBuilder();

        char[] letters = word.toCharArray();

        for (char letter : letters) {
            if (isNumeric(letter)) {
                number.append(letter);
            }
        }

        return Integer.parseInt(number.toString());
    }

    public static void main(String[] args) {
        ExtractNumbers extractNumbers = new ExtractNumbers();

        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        System.out.println(extractNumbers.getNumber(word));
        return;
    }
}
