package Core_java.inheritance;

public class Main {

    public static void main(String[] args) {

        System.out.println("From Parent Class");
        System.out.println("______________________________");
        SubClass obj = new SubClass();
        System.out.println(obj.programing);
        System.out.println(obj.name);
        obj.displayParentClass();

        System.out.println("-----------------------------");

        System.out.println("From Sub Class");
        System.out.println("_____________________________");
        System.out.println(obj.many);
        System.out.println(obj.year + " years");
        obj.displaySubClass();


    }
}
