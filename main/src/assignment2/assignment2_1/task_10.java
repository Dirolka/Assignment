package assignment2.assignment2_1;
import java.util.Scanner;
public class task_10 {
    public static int[][] multarr;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();
        multarr = new int[s][];
        for (int i = 0; i < s; i++) {
            int size = scanner.nextInt();
            multarr[i] = new int[size];
        }
        for (int[] row : multarr) {
            System.out.println(java.util.Arrays.toString(row));
        }

        scanner.close();
    }
}
