/*
Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов
 */

public class Task13 {
    public static void main(String[] args) {
        sortUp(array(5));
        sortDown(array((5)));
    }

    static int[][] array(int n) {
        int[][] arr = new int[n][n];
        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                arr[row][column] = (int) (Math.random() * 15);
            }
        }

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                System.out.print(arr[row][column] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }

    static void sortUp(int[][] arr) {
        System.out.println("Sort up:");
        int tmp;
        for (int row = 0; row < arr.length; row++) {
            for (int array = 0; array < arr.length; array++) {
                for (int column = 0; column < arr.length - 1; column++) {
                    if (arr[column][array] > arr[column + 1][array]) {
                        tmp = arr[column][array];
                        arr[column][array] = arr[column + 1][array];
                        arr[column + 1][array] = tmp;
                    }
                }
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr.length; column++) {
                System.out.print(arr[row][column] + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void sortDown(int[][] arr) {
        System.out.println("Sort down:");
        int tmp;
        for (int row = 0; row < arr.length; row++) {
            for (int array = 0; array < arr.length; array++) {
                for (int column = 0; column < arr.length - 1; column++) {
                    if (arr[column][array] < arr[column + 1][array]) {
                        tmp = arr[column][array];
                        arr[column][array] = arr[column + 1][array];
                        arr[column + 1][array] = tmp;
                    }
                }
            }
        }

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr.length; column++) {
                System.out.print(arr[row][column] + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
