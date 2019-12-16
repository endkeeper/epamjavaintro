package arrays_of_arrays;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит
максимальную сумму
 */

public class Task9 {
    public static void main(String[] args) {
        matrix(3);
        matrix(5);
        matrix(8);
    }

    private static void matrix(int n) {
        int[][] arr = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        int maxSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            System.out.println("Amount " + i + " column is " + sum);
            if (maxSum < sum) {
                maxSum = sum;
            }
            sum = 0;
        }
        System.out.println();
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maximal amount is " + maxSum);
        System.out.println();
    }
}
