package Core_java.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIf_Else {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number: ");
        int number = Integer.parseInt(input.readLine());

        String even = "Not Weird";
        String odd = "Weird";

        if (number % 2 == 0) {
           if(number >= 2 && number <= 5 || number >= 20) {

               System.out.println(even);

           }

           else if(number >= 6 && number <= 20) {

               System.out.println(odd);

           }
        }
        else{
            System.out.println(odd);
        }
    }
}
