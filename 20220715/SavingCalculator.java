import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###");

        System.out.println("적금 이자 계산기");
        System.out.println("월적립액을 입력해주세요(원):");
        double monthlyMoneyInput = scanner.nextDouble();

        System.out.println("적금 기간을 입력해주세요(년):");
        double moneyInputYear = scanner.nextDouble();

        System.out.println("연이자율을 입력해주세요(%):");
        double yearlyRate = scanner.nextDouble() / 1200;

        double totalInputMoney = monthlyMoneyInput * 12 * moneyInputYear;
        double beforeTaxTotal = monthlyMoneyInput * (1 + yearlyRate) * (Math.pow((1 + yearlyRate), moneyInputYear * 12) - 1) / yearlyRate;
        double interestAfterTax = (beforeTaxTotal - totalInputMoney) * 0.846;
        double totalAfterTax = totalInputMoney + interestAfterTax;

        String totalInput = df.format(totalInputMoney);
        String realInterest = df.format(interestAfterTax);
        String realTotalAfterTax = df.format(Math.round(totalAfterTax));

        System.out.println("원금합계: " + totalInput + "원");
        System.out.println("세후이자: " + realInterest + "원");
        System.out.println("세후 총 수령액: " + realTotalAfterTax + "원");
    }
}
