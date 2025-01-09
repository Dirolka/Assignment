package assignment1.assignment_2;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperature = sc.nextDouble();

        boolean isHigh;
        boolean isLow;

        isHigh = temperature > 37.5;
        isLow = temperature < 36.0;

        if (isHigh) {
            System.out.println("Your body temperature is high.");
        }
        else if (isLow) {
            System.out.println("Your body temperature is low.");
        }
        else {
            System.out.println("Your body temperature is normal.");
        }

        sc.close();
    }
}
