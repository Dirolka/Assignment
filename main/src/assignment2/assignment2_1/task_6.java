package assignment2.assignment2_1;
import java.util.Scanner;

public class task_6 {
    public static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int s = sc.nextInt();

        if (s > 0) {
            arr = new int[s];
            int maxNum = Integer.MIN_VALUE;
            for (int i = 0; i < s; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < s; i++) {
                if (arr[i] > maxNum) {
                    maxNum = arr[i];
                }
            }

            System.out.println(maxNum);
        }
    }
}
