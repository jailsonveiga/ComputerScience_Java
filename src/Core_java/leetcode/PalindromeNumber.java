package Core_java.leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        int remainder = 0;
        int reverse = 0;
        int originalX = x;

        if (x < 0) {
            System.out.println("false");
            return;
        }

        while(x > 0) {
            remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }

        if(reverse == originalX) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        }
    }
