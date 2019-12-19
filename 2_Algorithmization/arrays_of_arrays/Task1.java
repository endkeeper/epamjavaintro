package arrays_of_arrays;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего
 */

public class Task1 {
    public static void main(String[] arg) {
        show(new int[][]{
                {3, 6, 2},
                {3, 1, 4},
                {1, 4, 3}}
        );
        show(new int[][]{
                {3, 6, 2, 5, 6, 3, 2},
                {3, 1, 4, 0, 1, 4, 2},
                {1, 4, 3, 4, 2, 3, 1}}
        );
        show(new int[][]{
                {3, 6, 10, 5, 6, 1, 2},
                {0, 1, 4, 0, 1, 4, 2},
                {1, 10, 11, 4, 2, 3, 1},
                {1, 4, 3, 4, 2, 2, 1}}
        );
    }

    // todo исправить вывод столбцов (System.out.printf или system.out.print с пробелом по аналогии как в других задачах)
    private static void show(int[][] arr) {
        int rowCount = arr.length;
        int columnCount = arr[0].length;
        boolean isOdd = false;
        boolean isFirstMoreThanLast = false;
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                if (j % 2 != 0) {
                    isOdd = true;
                } else {
                    isOdd = false;
                }
                if (arr[0][j] > arr[rowCount - 1][j]) {
                    isFirstMoreThanLast = true;
                } else {
                    isFirstMoreThanLast = false;
                }
                if (isOdd == true && isFirstMoreThanLast) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
