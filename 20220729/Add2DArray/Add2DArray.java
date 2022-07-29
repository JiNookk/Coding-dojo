class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        int[][] temp = new int[arr1.length][arr1[1].length];

        for (int i = 0; i < arr1.length; i += 1) {
            for (int j = 0; j < arr1[i].length; j += 1) {
                temp[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        answer = temp;

        return answer;
    }
}
