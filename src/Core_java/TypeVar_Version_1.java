package Core_java;

public class TypeVar_Version_1 {

    int num3 = 50; // Instance Variable

    static int num1 = 10; // Static Variable

    public static void main(String[] args) {

        TypeVar_Version_1 obj = new TypeVar_Version_1(); // Instance of a class to access the num3 variable outside the main method

        int num2 = 25; // Local Variable

        System.out.println("Static Variable - " + TypeVar_Version_1.num1);

        System.out.println("Local Variable - " + num2);

        System.out.println("Instance Variable - " + obj.num3);
    }
}
