package Core_java.hackerrank;

import java.util.Scanner;

public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter a word maximum 10 characters: ");
            String words = input.next();
            if(words.length() > 10) {
                break;
            }

            System.out.println("Enter a digit maximum digits of 999");
            int nums = input.nextInt();
            if( String.valueOf(nums).length() > 3) {
                break;
            }

            System.out.printf("%-15s%03d\n", words, nums);
        }
        System.out.println("================================");
        System.out.println("Sorry either you enter more then 10 characters or more then 3 digits.");
    }
}
