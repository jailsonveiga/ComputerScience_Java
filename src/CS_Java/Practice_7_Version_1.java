package CS_Java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Practice_7_Version_1 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Regular price at 15% discount");
        float regular = input.nextFloat();

        float sale = discount(regular);

        DecimalFormat dis = new DecimalFormat("#.00");

        System.out.println("The total price are: $ " + dis.format(sale) + " dollars");

    }

    public static float discount(float price) {

        return price * .85f;

    }
}
