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
                3, 1);
        array(new int[][]{
                        {0, 0, 1, 4},
                        {2, -4, 3, -2}},
                1, 2);
    }
    // todo поправить вывод столбца/строки
    private static void array(int[][] x, int k, int p) {
        for (int i = 0; i < x[0].length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (i == k) {
                    System.out.println(x[i][j] + " row");
                }
                if (j == p) {
                    System.out.println(x[i][j] + " column");
                }
            }
        }
        System.out.println();
    }
}
