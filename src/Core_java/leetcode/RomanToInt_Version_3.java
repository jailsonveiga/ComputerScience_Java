package Core_java.leetcode;

public class RomanToInt_Version_3 {
    public static void main(String[] args) {
        String roman = "XXI";
        int result = romanToInt(roman);
        System.out.println("Roman numeral: " + roman + " Integer value: " + result);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int previous = getValue(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int current = getValue(s.charAt(i));
            if (previous < current) {
                result -= previous;
            } else {
                result += previous;
            }
            previous = current;
        }
        result += previous;
        return result;
    }

    private static int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException("Invalid Roman numeral");
        }
    }
}
