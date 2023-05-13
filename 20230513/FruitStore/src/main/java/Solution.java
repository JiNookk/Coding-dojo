public class Solution {
    public int solution(int k, int m, int[] score) {
        FruitSeller seller = new FruitSeller();

        return seller.getMaxProfit(m, score);
    }
}
