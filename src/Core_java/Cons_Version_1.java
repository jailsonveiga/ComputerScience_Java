package Core_java;

public class Cons_Version_1 {


    String name;
    int rno;

    Cons_Version_1() {
        name = "Jay";
        rno = 23;
    }

    public static void main(String[] args) {

        Cons_Version_1 obj = new Cons_Version_1();

        System.out.println("Name - " + obj.name);

        System.out.println("Room Number - " + obj.rno);

        }
    }

