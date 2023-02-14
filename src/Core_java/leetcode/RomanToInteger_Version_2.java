package Core_java.leetcode;

public class RomanToInteger_Version_2 {
    public static void main(String[] args) {
        String s = "V";
        int result = romanToInt(s);

        System.out.println("Roman numeral: " + s + " Integer value: " + result);

    }

    public static int romanToInt(String s) {

        int result = 0;
        int previous = romanCharToInt(s.charAt(0));

        for(int i = 1; i < s.length(); i++) {

            int current = romanCharToInt(s.charAt(i));

            if(previous < current) {
                result -= previous;
            }
            else{
                result += previous;
            }
            previous = current;
        }
        result += previous;

        return result;
    }

    public static int romanCharToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Invalid Roman Numeral");
        };
    }
}
