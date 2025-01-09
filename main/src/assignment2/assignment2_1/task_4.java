package assignment2.assignment2_1;

public class task_4 {
    public static int[] firstArr= new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArr = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArr;

    public static void main(String[] args) {
        resultArr = new int[firstArr.length + secondArr.length];
        for (int i = 0; i < firstArr.length; i++) {
            resultArr[i] = firstArr[i];
        }
        for (int i = 0; i < secondArr.length; i++) {
            resultArr[firstArr.length + i] = secondArr[i];
        }

        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }
    }
}
