package arrays_of_arrays;

/*
Найти наибольший элемент матрицы и заменить все нечетные элементы на его
 */

public class Task15 {
    public static void main(String[] args) {
        int[][] arr = matrix(3, 5);
        int max = max(arr);
        isOdd(arr, max);
    }

    private static int[][] matrix(int n, int m) {
        int[][] arr = new int[n][m];
        System.out.println("Before: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = (int) (Math.random() * 50 - 25);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        return arr;
    }

    private static int max(int[][] arr) {
        int max = arr[0][0];
        int rowCount = arr.length;
        int columnCount = arr[0].length;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (max <= arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max + " is maximum element");
        return max;
    }

    private static void isOdd(int[][] arr, int max) {
        int rowCount = arr.length;
        int columnCount = arr[0].length;
        System.out.println("After: ");
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (arr[i][j] % 2 != 0) {
                    arr[i][j] = max;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
