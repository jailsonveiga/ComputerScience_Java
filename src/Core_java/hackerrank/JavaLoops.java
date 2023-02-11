package Core_java.hackerrank;

import java.util.Scanner;

public class JavaLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums = input.nextInt();

        for(int i = 1; i <= 10; i++){
            int results = nums * i;
            System.out.println(nums + " x " + i + " = " + results);
        }

    }
}
