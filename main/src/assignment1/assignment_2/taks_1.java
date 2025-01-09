package assignment1.assignment_2;
import java.util.Scanner;

public class taks_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int s = scanner.nextInt();
        if (s >= 0) {
            System.out.println("it’s warm outside.");
        }else
            System.out.println("it’s cold outside");
        scanner.close();

    }

}
