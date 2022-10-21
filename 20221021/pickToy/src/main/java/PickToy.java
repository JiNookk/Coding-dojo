import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PickToy {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        int[] process = process(board, moves);

        answer = removeAndCountDupicate(process, moves.length);
        return answer;
    }

    private int removeAndCountDupicate(int[] process, int length) {
        // 한번씩 순차적으로 돌면서 중복 제거, 제거시마다 카운트 2개씩 증가
        List<Integer> result = new ArrayList<>(Arrays.stream(process).boxed().collect(Collectors.toList()));
        int count = 0;

        for (int i = 0; i < length / 2 + 1; i += 1) {
            for (int j = 0; j < result.size()-1; j += 1) {
                if (result.get(j) == result.get(j + 1)) {
                    result.remove(j);
                    result.remove(j);
                    count += 2;
                }
            }
        }

        return count;
    }

    public int[] process(int[][] board, int[] moves) {
        // 열의 길이만큼 board탐색. 0이 아니면 반환!, 그리고 board의
        List<Integer> storedToys = new ArrayList<>();

        Arrays.stream(moves).forEach(move -> {
            pick(board, move, storedToys);
        });

        int[] result = storedToys.stream().mapToInt(Integer::intValue).toArray();
        return result;
    }

    private void pick(int[][] board, int move, List<Integer> storedToys) {
        for (int i = 0; i < board.length; i += 1) {
            int currentMove = board[i][move - 1];
            if (currentMove != 0) {
                storedToys.add(currentMove);
                board[i][move - 1] = 0;
                break;
            }
        }
    }
}