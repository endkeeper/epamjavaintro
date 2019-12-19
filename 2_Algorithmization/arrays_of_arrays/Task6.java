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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // todo добавим 2 boolean переменные: isUpperTriangle, isLowerTriangle
                //  в случае, если isUpperTriangle || isLowerTriangle, то arr[i][j] = 1;
                if (i <= j && n - j > i) {
                    arr[i][j] = 1;
                }
                if (i >= j && n - j - 1 <= i) {
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
