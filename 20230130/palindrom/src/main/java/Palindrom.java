import java.util.Scanner;

public class Palindrom {
    public boolean isAlphabetic(char letter) {
        return Character.isAlphabetic(letter);
    }

    public String flip(String word) {
        StringBuilder builder = new StringBuilder(word);

        builder.reverse();

        return builder.toString();
    }

    public String strip(String word) {
        StringBuilder stripped = new StringBuilder();

        char[] letters = word.toCharArray();

        for (char letter : letters) {
            if (isAlphabetic(letter)) {
                stripped.append(letter);
            }
        }

        return stripped.toString();
    }

    public String solution(String word) {
        String lowerCased = word.toLowerCase();

        String stripped = strip(lowerCased);

        return stripped.equals(flip(stripped)) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Palindrom palindrom = new Palindrom();

        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        System.out.println(palindrom.solution(word));

        return;
    }
}
