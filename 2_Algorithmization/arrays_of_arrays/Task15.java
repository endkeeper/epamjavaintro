/*
Найти наибольший элемент матрицы и заменить все нечетные элементы на его
 */

public class Task15 {
    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        max(array(m, n), m, n);
    }

    static int[][] array(int m, int n) {
        int[][] arr = new int[m][n];
        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                arr[row][column] = (int) (Math.random() * 10);
            }
        }
        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(arr[row][column] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }

    static void max(int[][] arr, int m, int n) {
        int max = arr[0][0];
        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                if (max < arr[row][column]) {
                    max = arr[row][column];
                }
            }
        }

        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                if (arr[row][column] % 2 == 1) {
                    arr[row][column] = max;
                }
            }
        }

        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(arr[row][column] + "   ");
            }
            System.out.println();
        }
    }

}