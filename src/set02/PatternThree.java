package set02;

/*
pattern 03
=========
    1
   212
  32123
 4321234
543212345
 4321234
  32123
   212
    1
 =========
 */

public class PatternThree {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= 2*n; row++) {

            int totCol = (row > n) ? (2*n - row) : row;

            for (int space = 1; space <= n - totCol; space++){
                System.out.print(" ");
            }

            for (int column = totCol; column >= 1; column--) {
                System.out.print(column);
            }

            for (int column = 2; column <= totCol; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
