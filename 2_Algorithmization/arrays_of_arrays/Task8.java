import java.util.Scanner;

/*
В числовой матрице поменять местами два любых столбца. Номера столбцов вводит пользователь с клавиатуры.
 */

public class Task8 {
    public static void main(String[] args) {
        int column1;
        int column2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter numbers of columns");
        column1 = scn.nextInt();
        column2 = scn.nextInt();
        swap(array(4), column1, column2);
    }

    static int[][] array(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }

    static void swap(int[][] arr, int col1, int col2) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (col1 == j) {
                    int tmp = arr[i][col2];
                    arr[i][col2] = arr[i][col1];
                    arr[i][col1] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
