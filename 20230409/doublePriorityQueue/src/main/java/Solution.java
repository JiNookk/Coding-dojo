import java.util.PriorityQueue;

//- 최소힙과 최대힙을 동시에 생성
//- 두개에 동시에 연산을 진행한다.
//- 삽입
//- 최대 제거
//- 최소 제거

public class Solution {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

    public int[] solution(String[] operations) {
        for (String operation : operations) {
            String[] words = operation.split(" ");

            if (words[0].equals("I")) {
                insert(Integer.parseInt(words[1]));
                continue;
            }

            if (words[1].equals("-1")) {
                removeMin();
                continue;
            }

            removeMax();
        }

        if (maxHeap.size() == 0) {
            return new int[]{0, 0};
        }

        return new int[]{maxHeap.peek(), minHeap.peek()};
    }

    public void insert(int number) {
        maxHeap.add(number);
        minHeap.add(number);
    }

    public int removeMin() {
        if (maxHeap.size() == 0) {
            return 0;
        }

        Integer minimum = minHeap.remove();
        maxHeap.remove(minimum);
        return minimum;
    }

    public int removeMax() {
        if (maxHeap.size() == 0) {
            return 0;
        }

        Integer maximum = maxHeap.remove();
        minHeap.remove(maximum);
        return maximum;
    }
}
