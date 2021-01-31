/*
Найти положительные элементы главной диагонали квадратной матрицы
 */

public class Task10 {
    public static void main(String[] args) {
        positive(array(5));
    }

    static int[][] array(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (Math.random() * 10 - 5);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }

    static void positive(int[][] arr) {
        System.out.println("positive elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    if (arr[i][j] > 0) {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
        }
    }

}
