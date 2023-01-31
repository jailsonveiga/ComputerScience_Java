package CS_Java;

import java.util.Scanner;

public class Practice_12_Version_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] score = new int[3];

        System.out.println("Enter your first score:");
        score[0] = input.nextInt();

        System.out.println("Enter your second score");
        score[1] = input.nextInt();

        System.out.println("Enter your third score:");
        score[2] = input.nextInt();

        System.out.println((float)(score[0] + score[1] + score[2]) / 3);

    }
}
