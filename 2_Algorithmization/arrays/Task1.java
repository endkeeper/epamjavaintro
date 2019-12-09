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
        int[] A = new int[n];
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = scn.nextInt();
            if (A[i] % k == 0) {
                result += A[i];
            }
        }
        System.out.println("result is " + result);
    }
}
