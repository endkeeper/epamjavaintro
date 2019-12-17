package arrays_of_arrays;

/*
Найти положительные элементы главной диагонали квадратной матрицы
 */

public class Task10 {
    public static void main(String[] args) {
        matrix(3);
        matrix(6);
    }

    private static void matrix(int n) {
        int[][] arr = new int[n][n];
        System.out.println("Matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 100 - 50);
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (arr[i][i] >= 0) {
                System.out.print(arr[i][i] + " ");
            }
        }
        System.out.println();
    }
}
