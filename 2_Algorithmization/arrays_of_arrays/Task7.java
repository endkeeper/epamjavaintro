/*
Сформировать квадратную матрицу порядка n по заданому образцу. N - четное. Подсчитать количество
положительных элементов в ней.
 */

public class Task7 {
    public static void main(String[] args) {
        array(10);

    }

    static void array(int n) {
        double[][] arr = new double[n][n];
        int positive = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Math.sin((i ^ 2 - j ^ 2) / n);
                if (arr[i][j] > 0) {
                    positive++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("%8.2f", (arr[i][j])) + " ");
            }
            System.out.println();
        }
        System.out.println("Number of positive elements:  " + positive);
    }
}
