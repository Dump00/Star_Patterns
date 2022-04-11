package set01;

/*
pattern 04
=========
1
12
123
1234
12345
 =========
 */

public class PatternFour {
    public static void main(String[] args) {

        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
