import Core_java.ConsOver;
import Core_java.MethOver;
import Core_java.StaticBlockVarMeth_Version_1;

public class Main {

    public static void main(String[] args) {

      System.out.println(StaticBlockVarMeth_Version_1.name);

      StaticBlockVarMeth_Version_1.staticMethod();

      System.out.println("--------------------");

      ConsOver obj = new ConsOver();

      ConsOver objs = new ConsOver("Hello");

      System.out.println("--------------------");

      MethOver obj1 = new MethOver();

      obj1.add();
      obj1.add(10,30);

      System.out.println("--------------------");

      OperOver obj2 = new OperOver();
      obj2.add();



    }
}
