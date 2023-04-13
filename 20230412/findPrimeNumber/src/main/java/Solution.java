//- 문자열을 각각 분리한다.
//- 소수인지 판별하는 메서드 -> 1부터 자신까지 나눈다. -> 개수가 2 이상일 경우 false
//- 맨앞의 0을 모두 없애는 메서드
//- dfs를 이용해 이어붙일 수 있는 모든 경우를 만든다. -> 모든 경우 앞 0을 벗겨낸다.
//- set에 집어넣는다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
    Set<String> numberSet = new HashSet<>();
    List<String> numbers = new ArrayList<>();
    boolean[] isUsing;

    public int solution(String numbers) {
        int count = 0;
        LinkedList<String> numberList = new LinkedList<>(Arrays.asList(numbers.split("")));

        isUsing = new boolean[numberList.size()];

        dfs(numberList, 0);

//        1, 2, 3, 1 -> dfs ->
//        1단계 : 1, 2, 3, 1 ->
//        2단계 : 1이라면? -> 2, 3, 1 / 2 -> 1, 3, 1 / 3 -> 1, 2, 1 / 1 -> 1, 2, 3
//        3단계 ->
//        반복문으로 dfs진행하기
//        for문을 돌면서 dfs를 진행하는 숫자를 제거한다.

        for (String number : numberSet) {
            count += isPrimeNumber(number) ? 1 : 0;
        }

        System.out.println(numberSet.stream().filter((number) -> !number.isEmpty())
                .map(Integer::parseInt).sorted().toList());

        return count;
    }

    // 확인하고 싶은게 뭘까?
    // 우선 순서대로 dfs가 발생해야 한다. -> numbers에 어떻게 찍혀야 할까?
    // 1, 4, 3 -> 143, 134 / 413, 431 / 314, 341
    private void dfs(LinkedList<String> letters, int depth) {
        if (depth == isUsing.length) {
            String number = "";

            for (int i = 0; i < isUsing.length; i += 1) {
                number += isUsing[i] ? numbers.get(i) : "";
            }

            numberSet.add(trimLeadingZero(number));
            return;
        }

        for (int i = 0; i < letters.size(); i += 1) {
            LinkedList<String> copy = new LinkedList<>(letters);

            String remove = copy.remove(i);
            numbers.add(depth, remove);

            isUsing[depth] = true;
            dfs(copy, depth + 1);

            isUsing[depth] = false;
            dfs(copy, depth + 1);
        }

    }

    public boolean isPrimeNumber(String str) {
        if (str.equals("1") || str.equals("0") || str.isEmpty()) {
            return false;
        }

        int number = Integer.parseInt(str);

        for (int i = 2; i * i <= number; i += 1) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public String trimLeadingZero(String number) {
        if (!number.startsWith("0") || number.equals("0")) {
            return number;
        }

        return trimLeadingZero(number.substring(1));
    }
}
