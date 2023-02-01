import java.util.Scanner;

public class FindCharacter {
    public String toLowerCase(String word) {
        return word.toLowerCase();
    }

    public int countLetter(String word, String target) {
        int count = 0;

        String lowerCased = toLowerCase(word);
        String lowerCasedTarget = toLowerCase(target);

        char[] letters = lowerCased.toCharArray();

        for (char letter : letters) {
            if (String.valueOf(letter).equals(lowerCasedTarget)) {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        FindCharacter findCharacter = new FindCharacter();

        Scanner in = new Scanner(System.in);
        String word = in.next();
        String target = in.next().substring(0, 1);

        System.out.println(findCharacter.countLetter(word, target));

        return;
    }
}
