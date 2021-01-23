/*
Дан массив действительных чисел, размерность которого n. Посчитать, сколько в нем положиельных, отрицательных и
нулевых элементов
 */

public class Task23 {
    public static void main(String[] args) {
        int[] arr = {4, -2, 6, 0, 1, -3, 6, 3, 1, -7, 0, 2, 5, -3, -1, -7, 0, 4};
        int pos, neg, zero;
        pos = 0;
        neg = 0;
        zero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos++;
            } else if (arr[i] < 0) {
                neg++;
            } else {
                zero++;
            }
        }
        System.out.print("positive: " + pos + " negative: " + neg + " zero: " + zero);

    }
}
