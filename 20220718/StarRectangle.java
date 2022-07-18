import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가로, 세로 길이를 입력해주세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        String star = "";

        for (int i = 0; i < b; i += 1) {
            for (int j = 0; j < a; j += 1) {
                star = star + "*";
            }
            star = star + "\n";
        }

        System.out.println(star);
        System.out.println(a + b);
    }
}