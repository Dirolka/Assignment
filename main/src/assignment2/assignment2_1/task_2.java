package assignment2.assignment2_1;

public class task_2 {
    public static final String odd = "Odd";
    public static final String even = "Even";
    public static String[] strings = new String[5];

    public static void main(String[] args) {
        for (int i = 0; i < strings.length; i++) {
            if (i == 0 || i % 2 == 0) {
                strings[i] = even;

            }
            else {
                strings[i] = odd;

            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Index " + i + " = "+ strings[i]);
        }
    }
}
