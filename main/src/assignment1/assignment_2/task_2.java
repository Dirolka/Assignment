package assignment1.assignment_2;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String imya = sc.nextLine();
        int let = sc.nextInt();
        if (let >=18 && let<=28) {
            System.out.println(imya + ", come to the military registration and enlistment office");
        }
        sc.close();
    }
}
