import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(int n) {
        String answer = "";

        List<String> waterMelonClap = new ArrayList<>();

        for (int i = 0; i < n; i += 1) {
            if (i % 2 == 0) waterMelonClap.add("수");
            if (i % 2 == 1) waterMelonClap.add("박");
        }

        answer = String.join("", waterMelonClap);

        return answer;
    }
}
