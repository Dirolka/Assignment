package assignment1.assignment_2;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start: ");
        int start = sc.nextInt();
        System.out.println("Enter end: ");
        int end = sc.nextInt();

        System.out.println("Enter multiple: ");
        int mul = sc.nextInt();
        int sum = 0;
        for(int i = start; i < end; i++){
            if(i % mul == 0){
                continue;
            }
            sum += i;
        }
        System.out.println("The sum " + start + " to " + end + " multiples of " + mul + " is: " + sum);
        sc.close();
    }
}
