package Core_java.jay_practice.string_reverse;

public class Using_StringBuffer {
    public static void main(String[] args) {
        String str = "I Love To Code";

        StringBuffer newStr = new StringBuffer(str);

        newStr.reverse();

        String reverseString = newStr.toString();

        System.out.println(reverseString);
    }
}
