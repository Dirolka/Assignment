package assignment2.assignment2_3;

public class task_4 {
    public class Entity {
        public void move(){
            System.out.println("Мен қозғаламын");
        }
        public void eat(){
            System.out.println("Мен жеймін");
        }
    }
    public class Human extends
            Entity {

        public void speak(){
            System.out.println("Мен сөйлей аламын");
        }
    }
    public class JavaDeveloper
            extends Human {

        public void code(){
            System.out.println("Мен Java тілінде сөйлей аламын");
        }
    }
}