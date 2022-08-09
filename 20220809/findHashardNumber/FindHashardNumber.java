class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sum10th = sum10TH(x);

        boolean harshard = x % sum10th == 0;

        answer = harshard;

        return answer;
    }

    public int sum10TH(int x) {
        String input = String.valueOf(x);

        String[] words = input.split("");

        int [] digits = new int[words.length];

        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(words[i]);
        }

        int sum = 0;

        for (int digit : digits){
            sum += digit;
        }

        return sum;
    }
}
