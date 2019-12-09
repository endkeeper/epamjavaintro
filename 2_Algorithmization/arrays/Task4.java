package arrays;

/*
Даны действительные числа a1,a2,..., an. Поменять местами наибольший и нименьший элементы.
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        replace(6);
    }

    static void replace(int n) {
        int max = 0;
        int min = 0;
        int maxi = 0;
        int mini = 0;
        Scanner scn = new Scanner(System.in);
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
            if (numbers[i] > max) {
                max = numbers[i];
                maxi = i;
            }
            if (numbers[i] < min) {
                min = numbers[i];
                mini = i;
            }
        }
        numbers[maxi] = min;
        numbers[mini] = max;
        for (int x : numbers) {
            System.out.print(numbers[x] + " ");
        }
    }
}
