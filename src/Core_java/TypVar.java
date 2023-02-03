package Core_java;

public class TypVar {

//    int num1 = 10;  Instance variable can not be access from the main method

    static int num2 = 20; // static variable can be access outside from the main method

    public static void main(String[] arg) {

        int num3 = 50; // local variable can be access directly from a main method

//      System.out.println(num1); Output will give me an error

        System.out.println(num2); // Output will be 20

        System.out.println(num3); // Output will be 50

    }
}
