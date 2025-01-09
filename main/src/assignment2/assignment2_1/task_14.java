package assignment2.assignment2_1;
import java.util.Scanner;
public class task_14 {
    public static int[][] arr = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int[] rowSums = new int[3];
        int[] colSums = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                rowSums[i] += arr[i][j];
                colSums[j] += arr[i][j];
            }
        }
        int minSum = Integer.MAX_VALUE;

        for (int sum : rowSums) {
            if (sum < minSum) {
                minSum = sum;
            }
        }

        for (int sum : colSums) {
            if (sum < minSum) {
                minSum = sum;
            }
        }

        System.out.println(minSum);
        scanner.close();
    }
}
