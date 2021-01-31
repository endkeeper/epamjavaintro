/*
Матрицу 10х20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в которых
число 5 встречается три и более раз.
 */

public class Task11 {
    public static void main(String[] args) {
        repeats(array());
    }

    static int[][] array() {
        int[][] arr = new int[10][20];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                arr[i][j] = (int) (Math.random() * 15);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
        return arr;
    }

    static void repeats(int[][] arr) {
        System.out.println("Rows with 3 and more repeats num 5: ");
        final int NUM_OF_COUNTS = 3;
        int counts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 5) {
                    counts++;
                }
                if (counts == NUM_OF_COUNTS) {
                    System.out.print(i + " ");
                    break;
                }
            }
            counts = 0;
        }
    }

}
