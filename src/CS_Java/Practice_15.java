package CS_Java;

import java.util.Scanner;

public class Practice_15 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word?");
        String word = input.next();

        String wordConvert = word.toUpperCase();

        System.out.println("Convert to UpperCase: - " + wordConvert);
    }
}
