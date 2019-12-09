package arrays;

/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, положительных и нулевых
элементов
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        array(5);
    }

    static void array(int n) {
        int[] numbers = new int[n];
        Scanner scn = new Scanner(System.in);
        int pos = 0;
        int neg = 0;
        int zero = 0;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scn.nextInt();
            if (numbers[i] > 0) {
                pos++;
            } else if (numbers[i] == 0) {
                zero++;
            } else {
                neg++;
            }
        }
        System.out.println("positive numbers " + pos + " negative numbers " + neg + " zero numbers " + zero);
    }

}
