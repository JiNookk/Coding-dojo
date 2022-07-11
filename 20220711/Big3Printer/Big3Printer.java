import java.util.Scanner;

public class Big3Printer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("할 일1: ");
        String toDoList1 = scanner.nextLine();
        System.out.print("\n");

        System.out.print("할 일2: ");
        String toDoList2 = scanner.nextLine();
        System.out.print("\n");

        System.out.print("할 일3: ");
        String toDoList3 = scanner.nextLine();
        System.out.print("\n");

        System.out.println("오늘의 할 일 Big3는");
        System.out.println("1. " + toDoList1 + "\n2. " + toDoList2 + "\n3. " + toDoList3);

    }
}
