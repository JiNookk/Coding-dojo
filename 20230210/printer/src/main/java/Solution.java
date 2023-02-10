import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] priorities, int location) {
        List<Integer> priorityList = Arrays.stream(priorities)
                .boxed()
                .collect(Collectors.toList());

        Queue<Integer> queue = new LinkedList<>(priorityList);
        Printer printer = new Printer(queue, location);

        return printer.myOrder();
    }
}
