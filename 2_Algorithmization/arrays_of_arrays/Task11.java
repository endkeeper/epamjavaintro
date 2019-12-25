package arrays_of_arrays;

/*
Матрицу 10х20 заполнить случайными чслами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которой число 5
встречается три раза и более.
 */

public class Task11 {
    public static void main(String[] args) {
        matrix();
    }

    private static void matrix() {
        int[][] arr = new int[10][20];
        System.out.println("Matrix:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                arr[i][j] = (int) (Math.random() * 15);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0, numberFive = 0; i < 10; i++, numberFive = 0) {
            for (int j = 0; j < 20; j++) {
                if (arr[i][j] == 5 && ++numberFive == 3) {
                    System.out.println(i + " row");
                    break;
                }
            }
        }
    }
}
