package assignment1.assignment_2;

import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cif = 0;
        System.out.println("Write 'ENTER' to stop.");
        while (true){
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("ENTER")) {
                break;
            }
            cif += Integer.parseInt(input);
        }
        System.out.println("The total sum is: " + cif);
        sc.close();
    }
}
