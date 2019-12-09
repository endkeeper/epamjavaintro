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

    static void replace(int n) {
        int maxi = 0;
        int mini = 0;
        Scanner scn = new Scanner(System.in);
        float[] numbers = new float[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextFloat();
        }
        float max = numbers[0];
        float min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
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
