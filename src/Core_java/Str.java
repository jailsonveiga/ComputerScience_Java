package Core_java;

public class Str {
    public static void main(String[] args) {

        String name = new String("Java Programing");

        String name1 = new String("   Trim The Spaces   ");

        String nameTrim = name1.trim();

        String concatStr = name.concat(" " + nameTrim);

        System.out.println(name);

        System.out.println(nameTrim);

        System.out.println(concatStr);

        System.out.println(name.toUpperCase());

        System.out.println(nameTrim.toLowerCase());

        System.out.println(name.charAt(5));

        System.out.println(nameTrim.indexOf(nameTrim));

        System.out.println(name.compareTo(nameTrim));

        System.out.println(name.length());

    }
}
