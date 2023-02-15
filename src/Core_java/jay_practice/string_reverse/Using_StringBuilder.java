package Core_java.jay_practice.string_reverse;

public class Using_StringBuilder {

    public static void main(String[] args) {
       String str = "I Love To Code";

       StringBuilder newStr = new StringBuilder();

       for(int i = str.length() -1; i >= 0; i--) {

           newStr.append(str.charAt(i));

       }

       String reverseString = newStr.toString();

       System.out.println(reverseString);

       }
}
