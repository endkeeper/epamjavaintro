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
    }


    private static void show(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (j % 2 != 0) {
                    if (arr[0][j] > arr[2][j]) {
                        System.out.println(arr[i][j]);
                    }
                }
            }
        }
        System.out.println();
    }
}
