package Core_java.super_keyword;

public class Main {

    public static void main(String[] args) {

        SubClass obj = new SubClass();
        System.out.println(obj.name);
        System.out.println(obj.age);

        System.out.println("---------------------------");

        System.out.println("Using The Super Keyword:");
        obj.displaySuperClass();

    }



}
