package arrays_of_arrays;

/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */

public class Task3 {
    public static void main(String[] args) {
        array(new int[][]{
                        {1, 2, 4, 2},
                        {2, 1, 4, 2},
                        {1, 7, 4, 3},
                        {2, 3, 3, 5}},
                2, 3);
        array(new int[][]{
                        {4, 1, 1, 6},
                        {-3, 0, 2, 6},
                        {6, 7, 3, 6}},
                2, 1);
        array(new int[][]{
                        {0, 0, 1, 4},
                        {2, -4, 3, -2}},
                1, 2);
    }

    private static void array(int[][] x, int k, int p) {
        int rowCount = x.length;
        int columnCount = x[0].length;
        System.out.print("Row : ");
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (i == k) {
                    System.out.print(x[i][j] + "  ");
                }
            }
        }
        System.out.println();
        System.out.print("Column : ");
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (j == p) {

                    System.out.print(x[i][j] + "  ");
                }
            }
        }
        System.out.println();
    }
}
