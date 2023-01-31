package CS_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice_9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number?");
        int num1 = input.nextInt();

        System.out.println("Enter second number?");
        int num2 = input.nextInt();

        float result = (float) num1 / (float)num2;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("The division of two float number is: " + df.format(result));
    }
}
