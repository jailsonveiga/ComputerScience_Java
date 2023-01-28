package CS_Java;

import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Do you agree - Y or N?");
        char letter = input.next().charAt(0);

        if(letter == 'Y' || letter == 'y') {

            System.out.println("Agreed");

        }
        else if (letter == 'N' || letter == 'n') {

            System.out.println("Not Agreed");

        }
    }
}
