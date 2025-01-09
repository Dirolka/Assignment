package assignment2.assignment2_1;
import java.util.Scanner;
public class task_7 {
    public static String[] string;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        string = new String[6];
        System.out.println("Enter 6 strings:");
        for (int i = 0; i < 6; i++) {
            string[i] = sc.nextLine();
        }

        for (int i = 0; i < 6; i++) {
            if (string[i] == null) continue;

            for (int j = i + 1; j < 6; j++) {
                if (string[j] != null && string[i] != null && string[i].equals(string[j])) {
                    string[i] = null;
                    string[j] = null;
                }
            }
        }

        for (String str : string) {
            System.out.println(str);
        }
    }
}
