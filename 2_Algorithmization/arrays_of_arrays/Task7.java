package arrays_of_arrays;

/*
Сформировать квадратную матрицу порядка N по правилу и подсчитать количество положительных элементов.
 */

public class Task7 {
    public static void main(String[] args) {
        matrix(4);
        matrix(7);
        matrix(5);
    }

    private static void matrix(int n) {
        int pos = 0;
        double[][] arr = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = Math.sin((i ^ 2) - (j ^ 2) / n);
                if (arr[i][j] > 0) {
                    pos++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%7.2f", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Numbers of positive: " + pos);
        System.out.println();
    }
}
