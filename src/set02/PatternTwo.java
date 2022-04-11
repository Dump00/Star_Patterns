package set02;

/*
pattern 02
=========
    1
   212
  32123
 4321234
543212345
 =========
 */

public class PatternTwo {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++){
                System.out.print(" ");
            }

            for (int column = row; column >= 1; column--) {
                System.out.print(column);
            }

            for (int column = 2; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
