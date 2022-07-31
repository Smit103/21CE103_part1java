package s1;
/*ID: 21CE103
Name: Smit patel
Github link: https://github.com/Smit103/21CE103_part1java.git
AIM : The problem is to check whether a given Sudoku solution is correct.
*/
public class Sm9 {

    public static void main(String[] s) {

        int a1[][] = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
                      { 6, 7, 2, 1, 9, 5, 3, 4, 8 },
                      { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
                      { 8, 5, 9, 7, 6, 1, 4, 2, 3 },
                      { 4, 2, 6, 8, 5, 3, 7, 9, 1 },
                      { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
                      { 9, 6, 1, 5, 3, 7, 2, 8, 4 },
                      { 2, 8, 7, 4, 1, 9, 6, 3, 5 },
                      { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

        System.out.println(check(a1));
    }

    public static boolean check(int ar[][]) {
        int i, j;
        int count[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int count1[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        boolean b1 = true;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {

                if (count[ar[j][i]] > i) {
                    b1 = false;
                    return b1;
                }
                if (count1[ar[i][j]] > i) {
                    b1 = false;
                    return b1;
                }
                count1[ar[i][j]]++;
                count[ar[j][i]]++;
            }

        }
        return b1;
    }

}
