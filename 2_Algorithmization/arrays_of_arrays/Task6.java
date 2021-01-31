/*
Сформировать квадратную матрицу порядка n по заданому образцу. N - четное.
 */

public class Task6 {
    public static void main(String[] args) {
        array(8);
    }

    static void array(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j + 2 < n + 1 && i > j) || (i + j + 2 > n + 1 && i < j)) {
                    arr[i][j] = 0;
                } else {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}