package assignment2.assignment2_1;

public class task_11 {
    public static int[][][][] multarr = new int[][][][]{{{{4, 8, 15}, {16}}, {{23, 42}, {}}, {{1}, {2}, {3}, {4, 5}}}};

    public static void main(String[] args) {
        for (int[][][] fourDArr : multarr) {
            for (int[][] threeDArr : fourDArr) {
                for (int[] twoDArr : threeDArr) {
                    for (int num : twoDArr) {
                        System.out.println(num);
                    }
                }
            }
        }
    }
}
