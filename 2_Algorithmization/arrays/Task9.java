package arrays;

import java.util.Arrays;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел несколько,
то определить наименьшее из них
 */
// todo в будущем через сортировку
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

    private static void numbers(int[] arr) {
        System.out.println(Arrays.toString(arr));
        int number = arr[0];
        int frequency = 0;
        int currentElementFrequency;
        for (final int i : arr) {
            currentElementFrequency = 0;
            for (final int j : arr) {
                if (i == j) {
                    currentElementFrequency++;
                }
            }
            if (frequency < currentElementFrequency) {
                frequency = currentElementFrequency;
                number = i;
            }
            if (frequency == currentElementFrequency && i < number) {
                number = i;
            }
        }
        System.out.println("number " + number + " repeats " + frequency + " times");
    }
}