package Core_java;

public class Cons {

    String name; // Instance Variable
    int rno; // Instance Variable

    public static void main(String[] args) {

        Cons obj = new Cons(); // Create and object instance of a class to access the properties from the class

        System.out.println(obj.name); // Output return null because we're only declaring the name and store in obj with no value

        System.out.println(obj.rno); //  // Output return 0 because we're only declaring rno and store in obj with no value

    }
}
