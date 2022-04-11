package set01;

/*
pattern 02
=========
*****
*****
*****
*****
*****
 =========
 */

public class PatternTwo {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n; column++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
