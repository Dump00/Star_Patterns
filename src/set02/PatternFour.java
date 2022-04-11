package set02;

/*
pattern 04
=========
1 1 1 1 1 1 1 1 1 0
1 2 2 2 2 2 2 2 1 0
1 2 3 3 3 3 3 2 1 0
1 2 3 4 4 4 3 2 1 0
1 2 3 4 5 4 3 2 1 0
1 2 3 4 4 4 3 2 1 0
1 2 3 3 3 3 3 2 1 0
1 2 2 2 2 2 2 2 1 0
1 1 1 1 1 1 1 1 1 0
0 0 0 0 0 0 0 0 0 0

Process finished with exit code 0

 =========
 */

public class PatternFour {
    public static void main(String[] args) {

        int n = 5;

        int m = 2*n;

        for (int row = 1; row <= m; row++) {
            for (int column = 1; column <= m; column++) {
                int index = Math.min(Math.min(row,column), Math.min(m - row, m - column));
                System.out.print(index + " ");
            }
            System.out.println();
        }
    }
}
