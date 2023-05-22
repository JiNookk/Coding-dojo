public class MatrixMultiple {
    public int[][] convert(int[][] matrix) {
        int [][] converted = new int[matrix.length][];
        int length = matrix[0].length;

        for (int i = 0; i < matrix.length; i += 1) {
            int[] row = new int[length];

            for (int j = 0; j < length; j += 1) {
                row[j] = matrix[j][i];
            }

            converted[i] = row;
        }

        return converted;
    }


    public int multiple(int[] row, int[] column) {
        int number = 0;

        for (int i = 0; i < row.length; i += 1) {
            number += row[i] * column[i];
        }

        return number;
    }

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] converted = convert(arr2);




        return new int[0][];
    }
}
