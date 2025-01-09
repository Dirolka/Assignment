package assignment2.assignment2_1;
import java.util.Scanner;
public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();

        if (s > 0) {
            int[] numbers = new int[s];

            for (int i = 0; i < s; i++) {
                numbers[i] = scanner.nextInt();
            }

            if (s % 2 != 0) {
                for (int i = 0; i < s; i++) {
                    System.out.println(numbers[i]);
                }
            }
            else {
                for (int i = s - 1; i >= 0; i--) {
                    System.out.println(numbers[i]);
                }
            }
        }

        scanner.close();
    }
}
