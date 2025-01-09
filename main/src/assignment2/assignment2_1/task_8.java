package assignment2.assignment2_1;
public class task_8 {
    public static int[][] multipl_table;
    public static void main(String[] args) {
        multipl_table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multipl_table[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(multipl_table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
