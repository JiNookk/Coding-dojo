class Solution {
    public String solution(String s) {
        String middleString = "";

        if (s.length() == 0){
            return s;
        }

        if (s.length() % 2 == 1) {
            int middle = (s.length() - 1) / 2;

            middleString = s.substring(middle, middle + 1);
        }

        if (s.length() % 2 == 0){
            int middle = (s.length()) / 2 - 1;

            middleString = s.substring(middle, middle + 2);
        }

        return middleString;
    }
}
