import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SpiralMatrix spiralMatrix = new SpiralMatrix();

        System.out.print("배열 길이를 입력해주세요: ");

        int length = scanner.nextInt();

        spiralMatrix.mySolution(length);
    }

    private void mySolution(int arrayLength) {
        int length = Math.abs(arrayLength);
        int[][] spiral = new int[length][length];

        boolean isLengthPlus = true;
        if (arrayLength < 0){
            isLengthPlus = false;
        }
        boolean isLength0 = false;
        if (arrayLength == 0) {
            isLength0 = true;
        }

        int i = 0;
        int j = -1;
        int element = 0;
        int direction = 1;

        while (!isLength0 && isLengthPlus) {
            for (int index = 0; index < length; index += 1) {
                j += direction;

                spiral[i][j] = element;

                element += 1;
            }

            length -= 1;

            if (length == 0) {
                print(arrayLength,spiral);

                isLength0= true;

                continue;
            }

            for (int index = 0; index < length; index += 1) {
                i += direction;

                spiral[i][j] = element;

                element += 1;
            }

            direction *= -1;
        }

        if (!isLengthPlus){
            int temp = i;
            i = j;
            j = temp;
        }

        while (!isLength0 && !isLengthPlus) {
            for (int index = 0; index < length; index += 1) {
                i += direction;

                spiral[i][j] = element;

                element += 1;
            }

            length -= 1;

            if (length == 0) {
                print(Math.abs(arrayLength),spiral);

                isLength0= true;

                continue;
            }

            for (int index = 0; index < length; index += 1) {
                j += direction;

                spiral[i][j] = element;

                element += 1;
            }
            direction *= -1;
        }
    }

    private void print(int arrayLength, int[][] spiral) {
        for (int i = 0; i < arrayLength; i += 1) {
            for (int j = 0; j < arrayLength; j += 1) {
                System.out.print(spiral[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
