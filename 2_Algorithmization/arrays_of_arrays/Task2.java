package arrays_of_arrays;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие по диагонали
 */

public class Task2 {
    public static void main(String[] args) {
        diagonale(new int[][]{
                {1, 4, 2},
                {6, 3, 1},
                {1, 3, 2}});
        diagonale(new int[][]{
                {5, 1, -1},
                {1, -5, 0},
                {0, 2, 3}});
        diagonale(new int[][]{
                {4, 1, 3},
                {3, 3, 6},
                {8, 9, 7}});
    }

    private static void diagonale(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    System.out.println(arr[i][j]);
                    break;
                }
            }
        }
        System.out.println();
    }
}
