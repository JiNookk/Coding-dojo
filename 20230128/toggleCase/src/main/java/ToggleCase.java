import java.util.Scanner;

public class ToggleCase {
    public boolean isLowerCase(String letter) {
        return letter.toLowerCase().equals(letter);
    }

    public String toggleCharacter(String letter) {
        return isLowerCase(letter) ? letter.toUpperCase() : letter.toLowerCase();
    }


    public String toggleCase(String word) {
        StringBuilder toggled = new StringBuilder();

        String[] letters = word.split("");

        for (String letter : letters) {
            toggled.append(toggleCharacter(letter));
        }

        return toggled.toString();
    }

    public static void main(String[] args) {
        ToggleCase toggleCase = new ToggleCase();

        Scanner in = new Scanner(System.in);
        String word = in.next();

        System.out.println(toggleCase.toggleCase(word));
        return;
    }
}
