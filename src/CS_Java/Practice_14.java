package CS_Java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practice_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name?");
        String name = input.nextLine();

        int length = string_length(name);

        System.out.println(length);
    }

    private static int string_length(String name) {

        int i = 0;

        while (i < name.length() && name.charAt(i) != '\0') {

            i++;

        }
        return i;
    }
}
