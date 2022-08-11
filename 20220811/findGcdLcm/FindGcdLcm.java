class Solution {
    public int gcd(int num1, int num2){
        if(num2 == 0) return num1;
        else return gcd(num2, num1 % num2);
    }

    public int[] solution(int n, int m) {
        int[] answer = {};

        int gcd = gcd(n, m);

        int lcm = n * m / gcd;

        answer = new int[]{gcd,lcm};

        return answer;
    }
}
