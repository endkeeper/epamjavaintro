package arrays;

/*
Даны действительные числа a1,a2,..., an. Поменять местами наибольший и нименьший элементы.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        replace(6);
    }

    // todo переделать через method(new int[]{1,2,3}); вызвать на нескольких наборах данных
    private static void replace(int n) {
        // todo объявление индексов рядом с объявлением max и min
        int maxi = 0;
        int mini = 0;
        Scanner scn = new Scanner(System.in);
        float[] numbers = new float[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextFloat();
        }
        float max = numbers[0];
        float min = numbers[0];
        // todo просмотр от первого элемента
        for (int i = 0; i < numbers.length; i++) {
            // todo переприсваивание делать только в случае если текущий элемент меньше, чем предыдущий
            if (numbers[i] <= min) {
                min = numbers[i];
                mini = i;
            }
            if (numbers[i] >= max) {
                max = numbers[i];
                maxi = i;
            }
        }
        numbers[maxi] = min;
        numbers[mini] = max;
        System.out.println(Arrays.toString(numbers));
    }
}
