package set01;

/*
pattern 03
=========
*****
****
***
**
*
 =========
 */

public class PatternThree {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= n - row + 1; column++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
