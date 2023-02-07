package Core_java.method_overloading;

public class Overloading {

    void add() {
        int num1 = 24;
        int num2 = 3;
        int sumResult = num1 + num2;

        System.out.println("The Sum of two numbers are: " + sumResult);
    }

    void add(int num1, int num2) {

        System.out.println("The Sum of two numbers is : " + (num1 + num2));
    }

    int add(int z) {
        System.out.println("This is the method with a return type ");
        return z + 6;
    }


    public static void main(String[] args) {

        Overloading obj = new Overloading();
        obj.add();
        obj.add(2,7);
        int result = obj.add(5);
        System.out.println("The result is: " + result);
    }
}
