import Core_java.ConsOver;
import Core_java.StaticBlockVarMeth_Version_1;

public class Main {

    public static void main(String[] args) {

      System.out.println(StaticBlockVarMeth_Version_1.name);

      StaticBlockVarMeth_Version_1.staticMethod();

      System.out.println("--------------------");

      ConsOver obj = new ConsOver();

      ConsOver objs = new ConsOver("Hello");


    }
}
