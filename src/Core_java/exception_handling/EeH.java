package Core_java.exception_handling;

public class EeH {

    void display() {

        try{

            String str = "Hello";
            int num = Integer.parseInt(str);

        }
        catch(NumberFormatException e) {

            System.out.println(e);

        }

        System.out.println("Exception Handled...");

    }

    public static void main(String[] args) {

        EeH obj = new EeH();
        obj.display();

    }
}
