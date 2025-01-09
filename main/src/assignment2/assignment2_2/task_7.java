package assignment2.assignment2_2;

public class task_7 {
    public static void main(String[] args) {
        signIn("user");
        signIn("Diyar");
    }

    public static void signIn(String username) {
        if ("user".equals(username)) {
            return;
        }

        System.out.println("Welcome " + username);
        System.out.println("Missed you very much, " + username);
    }
}
