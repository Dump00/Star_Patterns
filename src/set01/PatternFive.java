package set01;

/*
pattern 05
=========
*
**
***
****
*****
****
***
**
*
 =========
 */

public class PatternFive {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= 2*n; row++) {
            int totCol = (row > n) ? (2*n - row) : row;
                for (int column = 1; column <= totCol; column++) {
                    System.out.print("*");
                }
                System.out.println();
        }
    }
}
