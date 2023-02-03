package Core_java;

public class Cons_Version_2 {

    String name;
    int rno;

    Cons_Version_2 (String str, int n) {
        name = str;
        rno = n;
    }


    public static void main(String[] args) {

        Cons_Version_2 obj = new Cons_Version_2("jay", 234);

        System.out.println("Name is: " + obj.name + ", Room Number is: " + obj.rno);
    }
}
