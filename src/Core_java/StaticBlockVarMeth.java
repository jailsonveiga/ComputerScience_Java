package Core_java;

public class StaticBlockVarMeth {

    static String name = "Jay";

    static void age () {

        System.out.println("Static method") ;

    }

    static{

        System.out.println("Static Block");

    }
    public static void main(String[] args) {

        System.out.println("My name is: - " + name);

        age();

    }
}
