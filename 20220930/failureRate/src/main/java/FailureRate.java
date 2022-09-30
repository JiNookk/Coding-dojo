import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FailureRate {
    public int[] solution(int N, int[] stages) {
        // N : 전체 스테이지 개수
        // stages: 게임을 이용하는 사용자가 현재 멈춰있는 스테이지
        // 실패율 : 스테이지에 도달했지만 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어의 수
        // 스테이지 별 실패율부터 구해야하겠네

        double[] failureRateArray = getFailureRateArray(N, stages);

        Map<Integer, Double> failureMap = failureMap(failureRateArray);

        int[] answer = result(failureMap);

        // 문제점: failureRate는 구했는데 이걸 순서로 다시 변환해주어야 한다.
        // 어떻게 순서로 변환할까?

        return answer;
    }

    public int[] result(Map<Integer, Double> failureMap) {
        List<Double> resultDouble = failureMap.values().stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        //더블 배열의 값이 map의 밸류와 같으면 키를 반환하라.
        List<Integer> resultList = new ArrayList<>();

        //키를 돌면서 인덱스를 반환해야하낟.
        for (int key : failureMap.keySet()) {

        }

        for (int i = 0; i < result.length; i += 1) {

            // 이전과 같은 키는 배제하기
            // 순서대로 다 돌기는 해야함.
            // 그 자체로 정렬하는 기능은 없을까?
            // 키 1, 2, 3, 4, 5....


            result[i] = failureMap.keySet().stream()
                    .filter(key -> failureMap.get(key) == resultDouble[index])
                    .findFirst().get();

        }
        return result;
    }

    public Map<Integer, Double> failureMap(double[] failureRateArray) {
        Map<Integer, Double> failureMap = new HashMap<>();

        for (int i = 0; i < failureRateArray.length; i += 1) {
            failureMap.put( i + 1, failureRateArray[i]);
        }

        return failureMap;
    }

    public double[] getFailureRateArray(int N, int[] stages) {
        return IntStream.range(1, N + 1)
                .mapToDouble(elem -> failureRate(stages, elem))
                .toArray();
    }

    public double failureRate(int[] stages, int stage) {
        //stage보다 크거나 같은 stages count -> 분모
        //stage와 같은 친구 -> 분자

        int divisor = Arrays.stream(stages)
                .filter(s -> s >= stage)
                .toArray().length;

        int divider = Arrays.stream(stages)
                .filter(s -> s == stage)
                .toArray().length;

        return (double) divider / divisor;
    }
}
