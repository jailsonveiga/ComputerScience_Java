package Core_java.abstract_class_and_abstract_methods;

public abstract class A {

    abstract void display();

    void show() {

        System.out.println("SHOW METHOD");

    }
}
class B extends A{

    void display() {

        System.out.println("Abstract Method in A");

    }
}

class AbstractMain{
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
        obj.show();
    }
}