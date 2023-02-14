package Core_java.jay_practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i = 0; i < t; i++) {
            long n = input.nextLong();
            if(n >= -128 && n <= 127) {
                System.out.println(n + " can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if(n >= -32768 && n <= 32767) {
                System.out.println(n + " can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if(n >= -2147483648 && n <= 2147483647) {
                System.out.println(n + " can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            } else {
                System.out.println(n + " can be fitted in:");
                System.out.println("* long");
            }
        }
    }
}
