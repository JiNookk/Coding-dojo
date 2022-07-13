import java.util.Scanner;

public class HappyBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("연도: ");
        int year = scanner.nextInt();

        boolean isYoonNyun = false;

        if (year % 4 == 0){
            isYoonNyun = true;
            if (year % 100 == 0){
                isYoonNyun = false;
            }
            if (year % 400 == 0){
                isYoonNyun = true;
            }
        }

        System.out.println(isYoonNyun);
    }
}
