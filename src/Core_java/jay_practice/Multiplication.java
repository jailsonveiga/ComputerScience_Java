package Core_java.jay_practice;

public class Multiplication {
    public static void main(String[] args) {
        /* For Outer Loop i
        1 <= 5 = true
        2 <= 5 = true
        3 <= 5 = true
        4 <= 5 = true
        5 <= 5 = true
         */

        /* For Inner Loop j
        1 <= 5 = True
        2 <= 5 = true
        3 <= 5 = true
        4 <= 5 = true
        5 <= 5 = true
         */

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.printf("%4d", i * j );
            }
            System.out.println();
        }
    }
}

      /*Output
         i1 * j1 = 1 - i1 * j2 = 2 - i1 * j3 = 3 - i1 * j4 = 4 - i1 * j5 = 5
         space
         i2 * j1 = 2 - i2 * j2 = 4 - i2 * j3 = 6 - i2 * j4 = 8 - i2 * j5 = 10
         space
         i3 * j1 = 3 - i3 * j2 = 6 - i3 * j3 = 9 - i3 * j4 = 12 - i3 * j5 = 15
         space
         i4 * j1 = 4 - i4 * j2 = 8 - i4 * j3 = 12 - i4 * j4 = 16 - i4 * j5 = 20
         space
         i5 * j1 = 5 - i5 * j2 = 10 - i5 * j3 = 15 - i5 * j4 = 20 - i5 * j5 = 25

         */