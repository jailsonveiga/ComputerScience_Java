package CS_Java;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many points did you lose?");
        int points = input.nextInt();

        if(points < 2) {

            System.out.println("You lost fewer points than me.");

        }

        else if(points > 2){

            System.out.println("You lost more points than me");

        }

        else{

            System.out.println("You lost the same points as me");

        }
    }
}
