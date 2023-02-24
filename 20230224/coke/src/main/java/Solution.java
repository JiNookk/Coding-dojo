class Solution {
    public int solution(int a, int b, int n) {
        Exchanger exchanger = new Exchanger(n);

        return exchanger.exchange(a, b);
    }
}
