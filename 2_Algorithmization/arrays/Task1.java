package arrays;

/*
В массиве A[n] занесены натуральные числа. Найти суммы тех элементов, которые кратн данному k
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        sum(3, 3);
    }

    static void sum(int n, int k) {
        Scanner scn = new Scanner(System.in);
        int[] a = new int[n];
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
            if (a[i] % k == 0) {
                result += a[i];
            }
        }
        System.out.println("result is " + result);
    }
}
