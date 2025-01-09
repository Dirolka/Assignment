package assignment1.assignment_2;

public class task_8 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        while (b<=100){
            if (b % 3 == 0){
                b++;
                continue;
            }
            a += b;
            b++;
        }
        System.out.println(a);
    }
}
