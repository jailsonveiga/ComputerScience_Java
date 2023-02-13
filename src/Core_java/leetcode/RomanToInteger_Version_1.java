package Core_java.leetcode;

public class RomanToInteger_Version_1 {
    public static void main(String[] args) {

        String s = "LV";
        int result = romanToInt(s);

        System.out.println("Roman numeral: " + s + " Integer value: " + result);

    }

    public static int romanToInt(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++) {

            int current = 0;

            switch(s.charAt(i)) {
                case 'I':
                    current = 1;
                    break;

                case 'V':
                    current = 5;
                    break;

                case 'X':
                    current = 10;
                    break;

                case 'L':
                    current = 50;
                    break;

                case 'C':
                    current = 100;
                    break;

                case 'D':
                    current = 500;
                    break;

                case 'M':
                    current = 1000;
                    break;

                default:
                    throw new IllegalArgumentException("Invalid Roman numeral");

            }

            if(i + 1 < s.length() && current < romanToInt(String.valueOf(s.charAt(i + 1)))) {

                current = -current;

            }

            result += current;

        }

        return result;

    }
}
