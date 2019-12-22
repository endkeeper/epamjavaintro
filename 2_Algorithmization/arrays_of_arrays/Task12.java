package arrays_of_arrays;

/*
Отсортировать строки матрицы по возрастанию и убыванию значений элементов*
 */

import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        matrix(5);
        matrix(7);
    }
    // todo матрица может бы не квадратной
    private static void matrix(int n) {
        int[][] arr = new int[n][n];
        System.out.println("Matrix:");
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                arr[row][column] = (int) (Math.random() * 50 - 25);
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}



