import java.util.Scanner;

public class FlipWord {
    public String flip(String word) {
        StringBuilder flipped = new StringBuilder();

        for (int i = 0; i < word.length(); i += 1) {
            flipped.append(word.charAt(word.length() - (i + 1)));
        }

        return flipped.toString();
    }

    public static void main(String[] args) {
        FlipWord flipWord = new FlipWord();

        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();

        while (in.hasNextLine()) {
            String word = in.nextLine();

            System.out.println(flipWord.flip(word));
        }

        return;
    }
}
