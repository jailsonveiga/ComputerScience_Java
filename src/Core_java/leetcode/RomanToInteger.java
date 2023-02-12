package Core_java.leetcode;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "XXI";
        int result = romanToInt(s);
        System.out.println("Roman numeral: " + s + " Integer value: " + result);

    }

    public static int romanToInt(String s) {
        int result = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            switch(c){
                case 'I':
                    if(i + 1 < s.length() && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                        result -= 1;
                    }
                    else{
                        result += 1;
                    }
                    break;

                case 'V':
                    result += 5;
                    break;

                case 'X':
                    if(i+ 1 < s.length() && (s.charAt(i + 1) == 'L' ||  s.charAt(i + 1) == 'C')) {
                        result -= 10;
                    }
                    else{
                        result += 10;
                    }
                    break;

                case 'L':
                    result += 50;
                    break;

                case 'C':
                    if(i + 1 < s.length() && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                        result -= 100;
                    }
                    else{
                        result += 100;
                    }
                    break;

                case 'D':
                    result += 500;
                    break;

                case 'M':
                    result += 1000;
                    break;

                default:
                    throw new IllegalArgumentException("Invalid Roman numeral");

            }
        }
        return result;
    }
}
