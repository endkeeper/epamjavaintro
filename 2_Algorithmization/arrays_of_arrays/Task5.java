package arrays_of_arrays;

/*
Сформировать квадратную матрицу порядка n по заданому образцу. N - четное.
 */

public class Task5 {
    public static void main(String[] args) {
        matrix(4);
        matrix(10);
        matrix(6);

        matrix(4);
        matrix(10);
        matrix(6);
    }

    private static void matrix(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // todo попробуй перенести этот if в условия цикла (до какого j необходимо выполнять тело цикла)
                if (n - i > j) {
                    arr[i][j] = i + 1;
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