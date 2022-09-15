import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String[] letters1 = o1.split("");
                String[] letters2 = o2.split("");

                if (!letters1[n].equals(letters2[n])) {
                    return letters1[n].compareTo(letters2[n]);
                }

                return o1.compareTo(o2);
            }
        });

        answer = strings;

        return answer;
    }
}
