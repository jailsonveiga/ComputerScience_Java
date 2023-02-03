package Core_java;

public class ComLiArg {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int addSum = num1 + num2;

        System.out.println("The total of 2 numbers add are: " + addSum);
    }
}
