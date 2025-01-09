package assignment2.assignment2_1;
import java.util.Scanner;
public class task_16 {
    public static char[][] arr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        arr = new char[height][2 * height - 1];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                if (j >= height - 1 - i && j <= height - 1 + i) {
                    arr[i][j] = '#';
                } else {
                    arr[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < 2 * height - 1; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        scanner.close();
    }
}
