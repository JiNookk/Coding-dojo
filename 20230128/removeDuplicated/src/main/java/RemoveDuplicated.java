import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicated {
    public String filter(String word) {
        String[] letters = word.split("");

        Set<String> set = new LinkedHashSet<>(Arrays.asList(letters));

        return String.join("", set);
    }

    public static void main(String[] args) {
        RemoveDuplicated removeDuplicated = new RemoveDuplicated();

        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        System.out.println(removeDuplicated.filter(word));
        return;
    }
}
