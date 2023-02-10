package Core_java.jay_practice;

public class Array {
    public static void main(String[] args) {
        int[] num = {2, 5, 7, 9};
        int target = 12;

        for(int i = 0; i < num.length; i++) {
           for(int j = i + 1; j < num.length; j++) {
               if (num[i] + num[j] == target) {
                   System.out.println(i + " " + j);
               }
           }
        }
    }
}
