package assignment2.assignment2_2;

public class task_6 {
    public static void main(String[] args) {
        universalMethod();
        universalMethod("E=mc^2");
        universalMethod(9.11);
        universalMethod("Hello");
        universalMethod(100);
        universalMethod(9, "is Karaganda");
        universalMethod(" ");
        universalMethod(false);
        universalMethod("wasd");
        universalMethod("A и Б сидели на трубе");
    }
      public static void universalMethod() {
            System.out.println("Universal method with no parameters called.");
      }

      public static void universalMethod(String s) {
            System.out.println("Universal method with stringer parameter: " + s);
      }

      public static void universalMethod(double d) {
            System.out.println("Universal method with integer parameter: " + d);
      }

      public static void universalMethod(int a) {
            System.out.println("Universal method with double parameter: " + a);
      }

      public static void universalMethod(int a, String s) {
            System.out.println("Universal method with integer and string parameters: " + a + ", " + s);
      }

      public static void universalMethod(boolean b) {
            System.out.println("Universal method with boolean parameter: " + b);
      }
}
