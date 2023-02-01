import java.util.Scanner;

public class FilteredFlip {
    public boolean isAlphabet(char letter) {
        return Character.isAlphabetic(letter);
    }

    public String flip(String word) {
        StringBuilder flipped = new StringBuilder();

        char[] letters = word.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];

            if (isAlphabet(letter)) {
                flipped.append(letters[letters.length - (i + 1)]);
                continue;
            }
            flipped.append(letters[i]);
        }

        return flipped.toString();
    }

    public static void main(String[] args) {
        FilteredFlip filteredFlip = new FilteredFlip();

        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        System.out.println(filteredFlip.flip(word));
        return;
    }
}
