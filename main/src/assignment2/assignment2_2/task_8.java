package assignment2.assignment2_2;

public class task_8 {
    public static void main(String[] args) {
        System.out.println(cube(9));
        System.out.println(cube(228));
        System.out.println(cube(-99));
        System.out.println(cube(897542));
    }

    public static long cube(long number) {
        return number * number * number;
    }
}