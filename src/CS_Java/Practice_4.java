package CS_Java;

import java.util.Scanner;

public class Practice_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number?");
        int num = input.nextInt();

        if(num % 2 == 0) {

            System.out.println(num + " is " + "Even number");

        }
        else{

            System.out.println(num + " is " + "Odd number");
        }

    }
}
