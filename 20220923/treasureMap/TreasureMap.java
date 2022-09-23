public class TreasureMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[][] bin1;
        String[][] bin2;
        String[][] result = new String[n][n];
        String str = "";

        bin1 = convert(n, arr1);
        bin2 = convert(n, arr2);
        for (int i = 0; i < bin1.length; i++) {
            for (int j = 0; j < bin1[i].length; j++) {
                if ("0".equals(bin1[i][j]) && "0".equals(bin2[i][j])) {
                    str += " ";
                } else {
                    str += "#";
                }
            }
            answer[i] = str;
            str = "";
        }
        return answer;
    }

    public String[][] convert(int n, int[] arr) {
        String binary = "";
        String bin[][] = new String[n][n];
        for (int i = 0; i < arr.length; i++) {
            binary = "";
            if (Integer.toBinaryString(arr[i]).length() < n) {
                for (int k = 0; k < n - Integer.toBinaryString(arr[i]).length(); k++) {
                    binary += "0";
                }
            }
            binary += Integer.toBinaryString(arr[i]);
            for (int j = 0; j < binary.length(); j++) {
                bin[i][j] = binary.substring(j, j + 1);
            }
        }
        return bin;
    }
}
