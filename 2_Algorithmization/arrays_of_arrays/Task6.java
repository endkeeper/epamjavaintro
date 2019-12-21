package arrays_of_arrays;

/*
Сформировать квадратную матрицу порядка n по заданому образцу. N - четное.
 */

public class Task6 {
    public static void main(String[] args) {
        matrix(6);
        matrix(8);
        matrix(4);
    }

    private static void matrix(int n) {
        int[][] arr = new int[n][n];
        boolean isUpperTriangle = false;
        boolean isLoverTriangle = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++, isLoverTriangle = false, isUpperTriangle = false) {
                if (i <= j && n - j > i) {
                    isUpperTriangle = true;
                }
                if (i >= j && n - j - 1 <= i) {
                    isLoverTriangle = true;
                }
                if (isLoverTriangle || isUpperTriangle) {
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
        System.out.println();
    }
}
