package Core_java.super_keyword;

public class SubClass extends SuperClass{

    int age = 21;
    String name = "Leila";


    void displaySuperClass() {

        System.out.println("My name is " + name + " and I'm " + age + " years old");

        System.out.println("My name is " + super.name + " and I'm " + super.age + " years old");

    }
}
