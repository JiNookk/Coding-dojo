import java.util.Arrays;

public class LeastSquare {
    public int solution(int[][] sizes) {
        int answer = 0;

        // 큰값, 작은값을 담은 배열 가져오기
        int [] bigSize = bigSize(sizes);
        int [] smallSize = smallSize(sizes);

        // 요소를 돌면서 가로, 세로 바꿔서 최댓값을 산출
        // 가로, 세로를 따로 받기!
        int maxWidth = maximum(bigSize);
        int maxHeight = maximum(smallSize);

        // 지갑크기 구하기
        answer = maxWidth * maxHeight;

        return answer;
    }


    public int[] bigSize(int[][] sizes) {
        int[] ints = Arrays.stream(sizes)
                .map(size -> {
                    if (size[0] < size[1]) {
                        return size[1];
                    }
                    return size[0];
                })
                .mapToInt(Integer::intValue)
                .toArray();

        return ints;
    }


    public int[] smallSize(int[][] sizes) {
        int[] ints = Arrays.stream(sizes)
                .map(size -> {
                    if (size[0] > size[1]) {
                        return size[1];
                    }
                    return size[0];
                })
                .mapToInt(Integer::intValue)
                .toArray();

        return ints;
    }

    public int maximum(int[] size) {
        return Arrays.stream(size).max().getAsInt();

    }
}
