package Core_java.leetcode;

public class RomanToInteger_Version_1 {
    public static void main(String[] args) {

        String s = "III";
        int result = romanToInt(s);

        System.out.println("Roman numeral: " + s + " Integer value: " + result);

    }

    public static int romanToInt(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++) {

            int current = switch (s.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> throw new IllegalArgumentException("Invalid Roman numeral");
            };

            if(i + 1 < s.length() && current < romanToInt(String.valueOf(s.charAt(i + 1)))) {

                current = -current;

            }

            result += current;

        }

        return result;

    }
}
