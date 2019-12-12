package arrays;


import java.util.Scanner;

/*
В массиве A[n] занесены натуральные числа. Найти суммы тех элементов, которые кратн данному k
 */
public class Task1 {
    public static void main(String[] args) {
        // TODO переделать через method(new int[]{1,2,3}); вызвать на нескольких наборах данных
        sum(3, 3);
    }

    private static void sum(int n, int k) {
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
