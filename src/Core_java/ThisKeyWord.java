package Core_java;

public class ThisKeyWord {

    int a = 10;

    void display() {

        int a = 200;

        System.out.println("Local Variable = " + a);

        System.out.println("Instance Variable = " + this.a);

    }

    public static void main(String[] args) {

        ThisKeyWord obj = new ThisKeyWord();

        obj.display();

    }
}
