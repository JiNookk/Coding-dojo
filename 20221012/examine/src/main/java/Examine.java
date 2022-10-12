import java.util.Arrays;

public class Examine {
    public int[] solution(int[] answers) {
        // 1번 2번 3번 방식
        // 1번 : 1 2 3 4 5 1 2 3 ...
        // 2번 : 2 1 2 3 2 4 2 5 ...
        // 3번 : 3 3 1 1 2 2 4 4 5 5 3 3 1
        int[] answer = new int[3];

        int[] ints = {correct(1, answers), correct(2, answers), correct(3, answers)};

        int max = Arrays.stream(ints).max().getAsInt();

        for (int i = 0; i < ints.length; i += 1) {
            if (ints[i] == max) {
                answer[i] = i + 1;
            }
        }

        return Arrays.stream(answer).filter(elem -> elem != 0).toArray();
    }

    public int correct(int index, int[] answers) {
        int [] answer = nthAnswer(index, answers);

        int count = 0;

        for (int i = 0; i < answer.length; i += 1) {
            if (answer[i] == answers[i]) {
                count += 1;
            }
        }

        return count;
    }

    public int[] nthAnswer(int index, int[] answers) {
        int [] answer = new int[answers.length];

        if (index == 1) {
            for (int i = 0; i < answer.length; i += 1) {
                answer[i] = (i) % 5 + 1;
            }
        }

        if (index == 2) {
            for (int i = 0; i < answer.length; i += 1) {
                switch (i% 8) {
                    case 1 -> answer[i] = 1;
                    case 3 -> answer[i] = 3;
                    case 5 -> answer[i] = 4;
                    case 7 -> answer[i] = 5;
                    default -> answer[i] = 2;
                }
            }
        }

        if (index == 3) {
            for (int i = 0; i < answer.length; i += 1) {
                switch (i % 10) {
                    case 0, 1 -> answer[i] = 3;
                    case 2, 3 -> answer[i] = 1;
                    case 4, 5 -> answer[i] = 2;
                    case 6, 7 -> answer[i] = 4;
                    default -> answer[i] = 5;
                }
            }
        }

        return answer;
    }
}
