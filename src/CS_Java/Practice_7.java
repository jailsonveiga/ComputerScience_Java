package CS_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.00");

        System.out.println("Regular Price at 15% discount");
        float price = input.nextFloat();
        float discountPrice = price * .85f;

        System.out.println("The total price are: $" + dec.format(discountPrice) + " dollars");
    }
}
