package arrays_of_arrays;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит
максимальную сумму
 */

public class Task9 {
    public static void main(String[] args) {
        matrix(3, 3);
        matrix(5, 5);
        matrix(8, 6);
    }

    private static void matrix(int n, int k) {
        int[][] arr = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        int maxSum = 0;
        for (int i = 0, sum = 0; i < k; i++, sum = 0) {
            for (int j = 0; j < n; j++) {
                sum += arr[j][i];
            }
            System.out.println("Amount " + i + " column is " + sum);
            if (maxSum < sum) {
                maxSum = sum;
            }
        }
        System.out.println();
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maximal amount is " + maxSum);
        System.out.println();
    }
}
