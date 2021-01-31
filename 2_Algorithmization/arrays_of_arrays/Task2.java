/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */
public class Task2 {
    public static void main(String[] args) {
        int n = 3;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(arr[i][j] + " ");
                }
                if (i + j + 2 == n + 1) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
