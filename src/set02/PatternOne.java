package set02;

/*
pattern 01
=========
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
 =========
 */

public class PatternOne {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= 2*n; row++) {
            int totCol = (row > n) ? (2*n - row) : row;
            int totSpaces = n - totCol;

            for (int s = 1; s <= totSpaces; s++){
                System.out.print(" ");
            }

            for (int column = 1; column <= totCol; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
