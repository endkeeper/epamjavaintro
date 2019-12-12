package arrays;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько,
то определить наименьшее из них
 */

public class Task9 {
    public static void main(String[] args) {
        numbers(new int[]{1, 54, 3, 4, 6, 1, 9, 4, 9, 1, 9, 9, 1, 9});
        numbers(new int[]{1, 54, 3, 4, 6, 1, 9, 4, 9, 1, 9, 9, 1, 9, 1});
        numbers(new int[]{1, 2, 2, 1});
        numbers(new int[]{5, 3, 3, 0});
        numbers(new int[]{1, 2, 2, 2});
        numbers(new int[]{1});
        numbers(new int[]{9, 9, 9, 9, 9, 9, 1, 1, 1, 1, 1});
    }

    // todo попробовать без дополнительного массива
    private static void numbers(int[] x) {
        int num = x[0];
        int mreturn = 0;
        int tmp = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                if (x[i] == x[j]) {
                    mreturn++;
                }
            }
            if (tmp < mreturn) {
                tmp = mreturn;
                num = x[i];
            } else if (tmp == mreturn) {
                if (num > x[i]) {
                    num = x[i];
                }
            }
            mreturn = 0;
        }
        System.out.println("number " + num + " repeats " + tmp + " times");
    }
}