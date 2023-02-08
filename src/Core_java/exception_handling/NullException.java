package Core_java.exception_handling;

public class NullException {

    void display() {

        try{
            String str = null;
            System.out.println(str.length());
        }
        catch(NullPointerException e) {

            System.out.println(e);

        }

        System.out.println("Exception Handled");
    }

    public static void main(String[] args) {

        NullException obj = new NullException();

        obj.display();

    }
}
