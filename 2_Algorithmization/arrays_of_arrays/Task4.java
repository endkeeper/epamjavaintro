package arrays_of_arrays;

/*
Сформировать квадратную матрицу порядка n по заданому образцу. N - четное.
 */

public class Task4 {
    public static void main(String[] args) {
        matrix(6);
        matrix(4);
        matrix(2);
    }

    private static void matrix(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    arr[i][j] = j + 1;
                    /*
                    * todo никогда не используем операторы без скобок ({}),
                    *  даже если одна операция. это правило промышленного программирования.
                    *  (в случае, если идут подряд несколько операторов и забыть поставить скобки
                    *  , то можно ошибиться и применить else или for только для одного оператора вместо нескольких.
                    *  поэтому правилом хорошего тона считается всегда явно указывать скобки, даже если следом идёт один оператор.)
                    * */
                } else arr[i][j] = n - j;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}