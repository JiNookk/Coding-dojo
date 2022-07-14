import java.util.Scanner;

public class OneTimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("급할 때 사용하는 일회용 계산기");
        System.out.println("숫자를 입력해주세요:");
        double inputNumber1 = scanner.nextDouble();

        System.out.println("연산자를 선택해주세요:");
        System.out.println("1. + (더하기)\n2. - (빼기)\n3. * (곱하기)\n4. / (나누기)");
        int selectOperator = scanner.nextInt();

        System.out.println("숫자를 입력해주세요:");
        double inputNumber2 = scanner.nextDouble();

        double resultNumber = 0;
        if (selectOperator != 1 && selectOperator != 2 && selectOperator != 3 && selectOperator != 4) {
            System.out.println("1,2,3,4번 중에 고르셔야 합니다!");
            return;
        }

        if (selectOperator == 1) {
            resultNumber = inputNumber1 + inputNumber2;
        }

        if (selectOperator == 2) {
            resultNumber = inputNumber1 - inputNumber2;
        }

        if (selectOperator == 3) {
            resultNumber = inputNumber1 * inputNumber2;
        }

        if (selectOperator == 4) {
            resultNumber = inputNumber1 / inputNumber2;
        }

        System.out.println("계산 결과: " + resultNumber);
    }
}
