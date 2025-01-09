package assignment2.assignment2_1;

public class task_3 {
    public static int[] arr = new int[]{-1, 2, 3, -4, -5};
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] * -1) % 2 == 0) {
                arr[i] *= -1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
