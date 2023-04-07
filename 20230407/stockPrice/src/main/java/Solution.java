//- 스택에 주식을 쌓는다.
//- 새로운 주식과 peek의 주식 가격을 비교 -> 만약 새로운 주식의 가격이 작다면 pop. 그 대신 주식의 가격이 같지 않을 때까지 비교를 진행.
//- pop할 때 배열의 index를 이용해서 index의 차이를 계산 -> 배열에 넣는다.

import java.util.Arrays;
import java.util.Stack;

class Stock{
    private final int index;
    private final int price;

    public Stock(int index, int price) {
        this.index = index;
        this.price = price;
    }

    public boolean isMoreExpensiveThan(Stock newStock) {
        return this.price > newStock.price;
    }

    public void recordTime(int[] answer, Stock newStock) {
        answer[this.index] = newStock.index - this.index;
    }
}

public class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Arrays.fill(answer, 0);

        Stack<Stock> stocks = new Stack<>();

        for (int i = 0; i < prices.length; i += 1) {
            Stock newStock = new Stock(i, prices[i]);

            while(!stocks.isEmpty() && stocks.peek().isMoreExpensiveThan(newStock)) {
                Stock removed = stocks.pop();
                removed.recordTime(answer, newStock);
            }

            stocks.push(newStock);
        }

        // 마지막에 남은 것들 처리
        Stock lastStock = stocks.peek();

        while (!stocks.isEmpty()) {
            Stock removed = stocks.pop();
            removed.recordTime(answer, lastStock);
        }

        return answer;
    }
}
