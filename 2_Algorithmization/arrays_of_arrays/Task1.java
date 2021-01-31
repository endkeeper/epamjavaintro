/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter n");
        n = scn.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 1) {
                    if (arr[0][j - 1] > arr[n - 1][j - 1])
                        System.out.print(arr[i - 1][j - 1] + " ");
                }
            }
            System.out.println();
        }
    }
}
