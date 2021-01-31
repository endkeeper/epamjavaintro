/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали
 */
public class Task3 {
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
        int k = 2;
        int p = 1;
        System.out.println();
        System.out.println("row k");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == k) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
        System.out.println("column p");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == p) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}

