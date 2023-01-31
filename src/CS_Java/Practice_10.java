package CS_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dollar amount");
        float pennies = input.nextFloat();

        int result =  Math.round(pennies * 100);

        System.out.println("Pennies: " + result);

    }
}
