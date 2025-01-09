package assignment2.assignment2_1;

public class task_9 {
    public static int[][] result = new int[10][10];
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                result[i][j] = i + j;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
