package sort;

/*
Сортировка выбором. Отсортировать по убиывнию последовательнть a1<=a2<=n
 */

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        sort(new int[]{43, 1, 4, 5, 8});
        sort(new int[]{3, 6, 16, 13, 16});
        sort(new int[]{10, 21, 54, 54, 123, 432});
        sort(new int[]{21, 10, 432, 54, -5, 123});
    }

    // todo пересмотри алгоритм
    private static void sort(int[] arr) {
        int length = arr.length;
        System.out.println("Before: ");
        System.out.print(Arrays.toString(arr));
        for (int i = 0; i < length; i++) {
            int maxi = i;
            for (int j = 0; j < length; j++) {
                if (arr[i] <= arr[j]) {
                    maxi = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[maxi];
            arr[maxi] = temp;
        }
        System.out.println();
        System.out.println("After: ");
        System.out.println(Arrays.toString(arr));
    }
}