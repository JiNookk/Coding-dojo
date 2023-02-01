import java.util.Scanner;

public class Decalcomani {
    public String isDecalcomani(String word) {
        String lowercased = word.toLowerCase();

        StringBuilder lower = new StringBuilder(lowercased);

        lower.reverse();

        String reversed = lower.toString();

        for (int i = 0; i < lowercased.length(); i += 1) {
            if (lowercased.charAt(i) != reversed.charAt(i)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Decalcomani decalcomani = new Decalcomani();

        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        System.out.println(decalcomani.isDecalcomani(word));

        return;
    }
}
