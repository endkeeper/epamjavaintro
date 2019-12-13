package arrays;

/*
Дана последовательность целых чисел a1,a2,...,an. Обзразовать новую последовательность, выбросив из исходной те члены,
которые равны min(a1,a2,...,an)
 */

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        min(new int[]{12, 43, 1, 3, 5, 1, 5, 2, 3, 1, 4, 3});
        min(new int[]{9, 8, 7, 6, 5, 4});
        min(new int[]{15, -3, 4, 1, -3, 6, 3, 2, 4});
    }

    private static void min(int[] arr) {
        System.out.println("before " + Arrays.toString(arr));
        int min = arr[0];
        int minCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                // в случае, если произошло переприсвавание,
                // то minCount опять считаем равным 1.
                minCount = 1;
            } else if (min == arr[i]) {
                minCount++;
            }
        }

        int[] newArr = new int[arr.length - minCount];
        for (int i = 0, n = 0; i < arr.length; i++) {
            // если элемент равен минимальному, то пропускаем
            if (arr[i] == min) {
                continue;
            }
            newArr[n++] = arr[i];
        }
        System.out.println("min = " + min);
        System.out.println("min count = " + minCount);
        System.out.print("after ");
        for (int m : newArr) {
            System.out.print(m + " ");
        }
        System.out.println();
        System.out.println();
    }
}
