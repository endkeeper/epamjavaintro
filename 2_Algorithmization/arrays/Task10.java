package arrays;

/*
Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент(освободившиеся
элементы заполнить нулями). Примичание. Дополнительн массив не использовать
 */

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        newArr(new int[]{1, 2, 4, 6, 3, 2, 1, 6});
        newArr(new int[]{6, 3, -1, 4, 55, 23, 0, 21, 3});
        newArr(new int[]{-14, 43, 52, 1, -2, 12, -43});

        second(new int[]{1, 2, 4, 6, 3, 2, 1, 6});
        second(new int[]{6, 3, -1, 4, 55, 23, 0, 21, 3});
        second(new int[]{-14, 43, 52, 1, -2, 12, -43});
    }

    static void newArr(int[] x) {
        int m = 1;
        int n = 0;
        for (int i = 1; i < x.length; i++) {
            if (i % 2 == 0) {
                n++;
                x[i - n] = x[i];
            }
        }
        m += n;
        for (int i = (x.length - m) + 1; i < x.length; i++) {
            x[i] = 0;
        }

        for (int c : x) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static void second(int[] arr) {
        System.out.println("before " + Arrays.toString(arr));
        int len = arr.length;
        int mid = (len % 2 == 0) ? len / 2 : (len / 2) + 1;
        for (int i = 0; i < len; i++) {
            if (i < mid) {
                arr[i] = arr[2 * i];
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("after " + Arrays.toString(arr));
    }
}
