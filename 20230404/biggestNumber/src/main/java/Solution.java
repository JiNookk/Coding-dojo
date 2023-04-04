//- 각각 요소의 앞글자만 비교하면 될 것 같다.
//- 정렬 후 전부 더하기

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(int[] numbers) {
        String answer = "";

//        신기하네 String의 기본 정렬은 어떻게 진행될까?
//        System.out.println("31".compareTo("4"));

//        List<String> sorted = Arrays.stream(numbers)
//                .mapToObj(number -> number + "")
//                .sorted((a, b) -> (b + a).compareTo(a + b))
//                .collect(Collectors.toList());
//        System.out.println(sorted);

        answer = Arrays.stream(numbers)
                .mapToObj(number -> number + "")
                .sorted((a, b) -> (b + a).compareTo(a + b))
                .collect(Collectors.joining());

        return answer.startsWith("0") ? "0" : answer;
    }

//    // 비교 (compareTo) -> 앞자리부터 비교 -> 크면 리턴, 같다면? -> 뒷자리 비교
//    // 만약 3과 30을 비교하게 되면? -> 3이 먼저와야함.
//    // 만약 3과 34를 비교하게 되면? -> 34가 먼저와야함.
//    public int compare(int o1, int o2) {
//        String big = Math.max(o1, o2) + "";
//        String small = Math.min(o1, o2) + "";
//
//        // 길이가 다른 상황에서 비교
//        int degree = big.length() - small.length();
//        if (degree > 0) {
////            누군가는 크다 근데 그게 o1인지 o2인지 모른다.
////            o1이 o2보다 크다면? -> o2에 더하기
////            작다면? -> o1에 더하기
//
//            int multiplier = (int) Math.pow(10, degree);
//
//            int left = o1;
//            int right = o2;
//            int weight = 0;
//
//            if (o1 >= o2) {
//                right *= multiplier;
//                weight = -1;
//            }
//            if (o1 < o2){
//                left *= multiplier;
//                weight = 1;
//            }
//
//            return left == right ? weight : left - right;
//        }
//
//        return o1 - o2;
//    }
}
