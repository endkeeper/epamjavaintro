/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой столбец
содержит максимальную сумму
 */

public class Task9 {
    public static void main(String[] args) {
        System.out.println("Max: " + max(sum(array(5))));
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

    static int[] sum(int[][] arr) {
        int[] colSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                colSum[j] += arr[i][j];
            }
        }
        System.out.println("Sum of elements in each column");
        for (int i : colSum) {
            System.out.print(i + " ");
        }
        System.out.println();
        return colSum;
    }

    static int max(int[] arr) {
        int result = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (result < arr[i]) {
                result = arr[i];
            }
        }
        return result;
    }

}

