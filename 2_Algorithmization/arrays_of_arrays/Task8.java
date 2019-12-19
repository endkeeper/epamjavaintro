package arrays_of_arrays;

import java.util.Scanner;

/*
В числовой матрице поменять местами два столбца любых столбца, т.е. все элементы одного столбца поставить на соответствующие им позиции другого,
а его элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task8 {
    public static void main(String[] args) {
        matrix(4);
    }

    private static void matrix(int n) {
        // todo количество столбцов может быть не равным количеству строк
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Before:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numbers of columns");
        int column1 = scn.nextInt();
        int column2 = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int number = arr[i][column1];
            arr[i][column1] = arr[i][column2];
            arr[i][column2] = number;
        }
        System.out.println("After:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
