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
        // todo numberFive сделать как loop variable
        int numberFive = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (arr[i][j] == 5) {
                    numberFive++;
                }
            }
            // todo как только достигли необходимого количества, то печатаем и переходим к следующей итерации через continue
            if (numberFive >= 3) {
                System.out.println(i + " row");
            }
            // todo обнуление в соотв. секции цикла for
            numberFive = 0;
        }
    }
}
