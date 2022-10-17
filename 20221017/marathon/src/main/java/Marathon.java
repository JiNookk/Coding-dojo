import java.util.Arrays;

public class Marathon {
    public String solution(String[] participant, String[] completion) {
        Arrays.sort(completion);
        Arrays.sort(participant);

        String answer = "";
        for (int i = 0; i < participant.length; i += 1) {
            if (i == participant.length - 1 || !participant[i].equals(completion[i]) ) {
                 return participant[i];
            }
        }

        return answer;
    }
}
