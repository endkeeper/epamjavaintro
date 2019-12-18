package arrays_of_arrays;

/*
Сформировать квадратную матрицу порядка n по заданому образцу. N - четное.
 */

public class Task6 {
    public static void main(String[] args) {
        matrix(10);
        matrix(8);
        matrix(4);
    }

    private static void matrix(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            // todo 1. без лишних присваиваний ( int 0 значение по умолчанию)
            //  2. объединить if либо 2 вложенных for без if
            //  (1 for для верхней матрица, 1 for для нижней
            //  либо 1 if для верхней матрицы, 1 if для нижней)
            for (int j = 0; j < n; j++) {
                arr[i][j] = 1;
                if (i < n / 2) {
                    if (j < i) {
                        arr[i][j] = 0;
                    }
                    if (n - j <= i) {
                        arr[i][j] = 0;
                    }
                } else {
                    if (n - 2 - j >= i) {
                        arr[i][j] = 0;
                    }
                    if (j > i) {
                        arr[i][j] = 0;
                    }
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