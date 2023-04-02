import java.util.PriorityQueue;

class MinHeap{
    PriorityQueue<Integer> minHeap;

    public MinHeap(int[] dataArray) {
        setData(dataArray);
    }

    private void setData(int[] dataArray) {
        minHeap = new PriorityQueue<>();

        for (int data : dataArray) {
            minHeap.add(data);
        }
    }

    public boolean isMoreThan(int number) {
        return this.minHeap.size() > 0 && this.minHeap.peek() >= number;
    }

    public int remove() {
        return this.minHeap.remove();
    }

    public int root() {
        return this.minHeap.size() > 0 ? this.minHeap.peek() : 0;
    }

    public int add(int number) {
        this.minHeap.add(number);

        return number;
    }

    public int size() {
        return this.minHeap.size();
    }
}

public class Solution {
    public int solution(int[] scoville, int K) {
        MinHeap minHeap = new MinHeap(scoville);
        int count = 0;

        while (!minHeap.isMoreThan(K)) {
            if (minHeap.size() == 1) {
                count = -1;
                break;
            }

            count += 1;
            calcScoville(minHeap);
        }

        return count;
    }

    public int calcScoville(MinHeap minHeap) {
        int minimum = minHeap.remove();
        int secondMinumum = minHeap.remove();

        int newScoville = minimum + 2 * secondMinumum;
        minHeap.add(newScoville);

        return newScoville;
    }
}
