package Core_java;

public class StrBuf {
    public static void main(String[] args) {

        StringBuffer obj = new StringBuffer("Welcome");

        System.out.println("Display Message On The Screen - " + obj);

        System.out.println(obj.append(" To java"));

        System.out.println(obj.charAt(6));

        System.out.println(obj.delete(2, 5));

        System.out.println(obj.deleteCharAt(6));

        System.out.println(obj.isEmpty());
    }
}
