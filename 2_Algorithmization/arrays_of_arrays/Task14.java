/*
Сформировать случайную матрицу m*n, состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру
столбца.
 */

public class Task14 {
    public static void main(String[] args) {
        shuffle(array(5, 3), 5, 3);
    }

    static int[][] array(int m, int n) {
        int[][] arr = new int[m][n];
        int count = 0;
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < m; column++) {
                if (count < row) {
                    arr[column][row] = 1;
                    count++;
                }
            }
            count = 0;
        }

        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(arr[row][column] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }

    static void shuffle(int[][] arr, int m, int n) {
        for (int select = 0; select < n; select++) {
            for (int i = m - 1; i >= 1; i--) {
                int j = (int) (Math.random() * i);
                int tmp = arr[j][select];
                arr[j][select] = arr[i][select];
                arr[i][select] = tmp;
            }
        }

        for (int row = 0; row < m; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(arr[row][column] + "   ");
            }
            System.out.println();
        }
    }

}
