package Core_java.exception_handling;

public class Ex {

    void display() {

        try{
            int a = 5/0;
        }
        catch(ArithmeticException e) {

            System.out.println(e);

        }

        System.out.println("Exception Handled...");

    }

    public static void main(String[] args) {

        Ex obj = new Ex();
        obj.display();
    }
}
