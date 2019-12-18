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

    // todo arr.length и arr[0].length выносим в отдельные переменные,
    //  указывая их имена во всех задачах (rowCount, columnCount и тд)
    // todo исправить вывод столбцов (System.out.printf или system.out.print с пробелом по аналогии как в других задачах)
    private static void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            // todo j от 0
            for (int j = 1; j < arr[0].length; j++) {
                // todo предусмотреть, что j может быть от 0
                // todo здесь идут 2 if, их можно объединить в один.
                //  сделать через переменные: одна переменная boolean isOdd
                //  вторая boolean isFirstMoreThanLast
                //  если и первая и вторая одновременно true (isOdd && isFirstMoreThan)
                //  то печатаем
                if (j % 2 != 0) {
                    // todo количество столбцов может быть больше чем 2
                    if (arr[0][j] > arr[2][j]) {
                        System.out.println(arr[i][j]);
                    }
                }
            }
        }
        System.out.println();
    }
}
