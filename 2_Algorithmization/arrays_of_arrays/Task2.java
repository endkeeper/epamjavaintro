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
                {4, 1},
                {3, 3}});
        diagonale(new int[][]{
                {-1, 1, 3, 5},
                {3, 12, 6, 7},
                {8, 9, 7, 8},
                {8, 9, 7, 9}});
    }

    private static void diagonale(int[][] arr) {
        int count = arr.length;
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
    }
}
